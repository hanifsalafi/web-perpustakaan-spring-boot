package com.mycompany.model;

import javax.persistence.*;

@Entity
public class Buku {

    @Id
    private Integer id_buku;

    @Column(name = "judul")
    private String judul;

    @Column(name = "pengarang")
    private String pengarang;

    @Column(name = "penerbit")
    private String penerbit;

    @Column(name = "tahun_terbit")
    private String tahun_terbit;

    @Column(name = "kategori")
    private String kategori;

    @Column(name = "jumlah_buku")
    private int jumlah_buku;

    @Version
    @Column(name = "opt_version", columnDefinition = "integer DEFAULT 0")
    private Integer version;

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId_buku() {
        return id_buku;
    }

    public void setId_buku(Integer id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public int getJumlah_buku() {
        return jumlah_buku;
    }

    public void setJumlah_buku(int jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }
}
