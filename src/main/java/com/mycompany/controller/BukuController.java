package com.mycompany.controller;

import com.mycompany.model.Buku;
import com.mycompany.service.BukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BukuController {

    private BukuService bukuService;
     private String BUKU = "buku";

    @Autowired
    public void setBukuService(BukuService bukuService) {
        this.bukuService = bukuService;
    }

    @RequestMapping(value = "/buku")
    public String showBuku(Model model) {
        model.addAttribute(BUKU, bukuService.listBuku());
        return "data_buku";
    }

    @RequestMapping(value = "/buku/create", method = RequestMethod.GET)
    public String tambahBuku(Model model) {
        model.addAttribute(BUKU, new Buku());
        return "tambah_buku";
    }

    @RequestMapping(value = "/buku/create", method = RequestMethod.POST)
    public String tambahBuku(Model model, Buku buku) {
        model.addAttribute(BUKU, bukuService.simpanBuku(buku));
        return "redirect:/buku";
    }

    @RequestMapping(value = "/buku/edit/{idBuku}", method = RequestMethod.GET)
    public String editBuku(@PathVariable Integer idBuku, Model model){
        model.addAttribute(BUKU, bukuService.getIdBuku(idBuku));
        return "edit_buku";
    }

    @RequestMapping(value = "/buku/delete/{idBuku}")
    public String deleteBuku(@PathVariable Integer idBuku, Model model){
        bukuService.deleteBuku(idBuku);
        return "redirect:/buku";
    }
}
