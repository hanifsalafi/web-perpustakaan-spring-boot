package com.mycompany.controller;

import com.mycompany.model.Peminjaman;
import com.mycompany.service.AnggotaService;
import com.mycompany.service.BukuService;
import com.mycompany.service.PeminjamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeminjamanController {

    private PeminjamanService peminjamanService;
    private AnggotaService anggotaService;
    private BukuService bukuService;
    private String PEMINJAMAN = "peminjaman";

    @Autowired
    public void setPeminjamanService(PeminjamanService peminjamanService) {
        this.peminjamanService = peminjamanService;
    }

    @Autowired
    public void setAnggotaService(AnggotaService anggotaService){
        this.anggotaService = anggotaService;
    }

    @Autowired
    public void setBukuService(BukuService bukuService){
        this.bukuService = bukuService;
    }

    @RequestMapping(value = "/peminjaman")
    public String showPeminjaman(Model model) {
        model.addAttribute(PEMINJAMAN, peminjamanService.listPeminjaman());
        return "data_pinjaman";
    }

    @RequestMapping(value = "/peminjaman/create", method = RequestMethod.GET)
    public String addPeminjaman(Model model) {
        model.addAttribute("anggota", anggotaService.listAnggota());
        model.addAttribute("buku", bukuService.listBuku());
        model.addAttribute(PEMINJAMAN, new Peminjaman());
        return "tambah_pinjaman";
    }

    @RequestMapping(value = "/peminjaman/create", method = RequestMethod.POST)
    public String addPeminjaman(Model model, Peminjaman peminjaman) {
        model.addAttribute(PEMINJAMAN, peminjamanService.savePeminjaman(peminjaman));
        return "redirect:/peminjaman";
    }

    @RequestMapping(value = "/peminjaman/edit/{id_pinjam}", method = RequestMethod.GET)
    public String editPeminjaman(@PathVariable Integer id_pinjam, Model model){
        model.addAttribute(PEMINJAMAN, peminjamanService.getIdPeminjaman(id_pinjam));
        return "pengembalian";
    }
        
    @RequestMapping(value = "/peminjaman/delete/{idPinjam}")
    public String deletePeminjaman(@PathVariable Integer idPinjam, Model model){
        peminjamanService.deletePeminjaman(idPinjam);
        return "redirect:/peminjaman";
    }


}
