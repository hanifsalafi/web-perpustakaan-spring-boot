package com.mycompany.controller;

import com.mycompany.model.Anggota;
import com.mycompany.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AnggotaController {

    private AnggotaService anggotaService;
    private String ANGGOTA = "anggota";

    @Autowired
    public void setAnggotaService(AnggotaService anggotaService) {
        this.anggotaService = anggotaService;
    }


    @RequestMapping(value = "/anggota")
    public String showAnggota(Model model) {
        model.addAttribute(ANGGOTA, anggotaService.listAnggota());
        return "data_anggota";
    }

    @RequestMapping(value = "/anggota/create", method = RequestMethod.GET)
    public String newMahasiswa(Model model) {
        model.addAttribute(ANGGOTA, new Anggota());
        return "tambah_anggota";
    }

    @RequestMapping(value = "/anggota/create", method = RequestMethod.POST)
    public String saveMahasiswa(Model model, Anggota anggota) {
        model.addAttribute(ANGGOTA, anggotaService.saveAnggota(anggota));
        return "redirect:/anggota";
    }

    @RequestMapping(value = "/anggota/edit/{id}", method = RequestMethod.GET)
    public String editAnggota(@PathVariable Integer id, Model model){
        model.addAttribute(ANGGOTA, anggotaService.getIdAnggota(id));
        return "tambah_anggota";
    }

    @RequestMapping(value = "/anggota/delete/{id}")
    public String deleteAnggota(@PathVariable Integer id, Model model){
        anggotaService.deleteAnggota(id);
        return "redirect:/anggota";
    }





}
