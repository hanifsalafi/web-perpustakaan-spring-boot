package com.mycompany.model;

import javax.persistence.*;

@Entity
public class Mahasiswa {


    @Id
    private Integer id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "jurusan")
    private String jurusan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {this.id = id; }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }


}
