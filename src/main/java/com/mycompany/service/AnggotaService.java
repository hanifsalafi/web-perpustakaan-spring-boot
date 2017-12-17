package com.mycompany.service;

import com.mycompany.model.Anggota;

import java.util.List;

public interface AnggotaService {

    List<Anggota> listAnggota();

    Anggota saveAnggota(Anggota anggota);

    Anggota getIdAnggota (Integer id);

    public void deleteAnggota(Integer id);

    Iterable<Anggota> listAnggotabyId(Integer id);
}
