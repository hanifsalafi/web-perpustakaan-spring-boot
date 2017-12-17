package com.mycompany.repository;

import com.mycompany.model.Peminjaman;
import org.springframework.data.repository.CrudRepository;

public interface PeminjamanRepository extends CrudRepository<Peminjaman, Integer> {
}
