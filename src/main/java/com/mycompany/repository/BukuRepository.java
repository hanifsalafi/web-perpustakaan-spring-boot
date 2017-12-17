package com.mycompany.repository;

import com.mycompany.model.Buku;
import org.springframework.data.repository.CrudRepository;

public interface BukuRepository extends CrudRepository<Buku, Integer> {

}
