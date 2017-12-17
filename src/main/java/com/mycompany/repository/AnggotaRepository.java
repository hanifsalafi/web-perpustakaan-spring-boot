package com.mycompany.repository;

import com.mycompany.model.Anggota;
import org.springframework.data.repository.CrudRepository;

public interface AnggotaRepository extends CrudRepository<Anggota, Integer>{
    Iterable<Anggota> findById(Integer id);
}
