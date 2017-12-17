package com.mycompany.service;

import com.mycompany.model.Buku;

import java.util.List;

public interface BukuService {

    List<Buku> listBuku();

    Buku simpanBuku(Buku buku);

    Buku getIdBuku(Integer id_buku);

    public void deleteBuku(Integer id_buku);


}
