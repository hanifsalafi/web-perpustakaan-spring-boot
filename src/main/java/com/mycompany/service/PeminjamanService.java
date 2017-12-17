package com.mycompany.service;

import com.mycompany.model.Peminjaman;

import java.util.List;

public interface PeminjamanService{
    List<Peminjaman> listPeminjaman();

    Peminjaman savePeminjaman(Peminjaman peminjaman);

    Peminjaman getIdPeminjaman(Integer id_pinjam);
    
     public void deletePeminjaman(Integer id_pinjam);
}

