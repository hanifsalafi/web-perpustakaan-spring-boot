package com.mycompany.service;

import com.mycompany.model.Mahasiswa;

import java.util.List;

public interface MahasiswaService {

    List<Mahasiswa> listMahasiswa();

    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);


}
