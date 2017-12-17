package com.mycompany.model;

import javax.persistence.*;

@Entity
public class Peminjaman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pinjam;

    @Column(name = "id_anggota")
    private Integer id_anggota;

    @Column(name = "id_buku")
    private Integer id_buku;

    @Column(name = "tanggal_pinjam")
    private String tanggal_pinjam;

    @Column(name = "tanggal_kembali")
    private String tanggal_kembali;

    @Column(name = "status",  columnDefinition = "VARCHAR(30) DEFAULT 'dipinjam'")
    private String status;

    @Version
    @Column(name = "opt_version", columnDefinition = "integer DEFAULT 0")
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId_pinjam() {
        return id_pinjam;
    }

    public void setId_pinjam(Integer id_pinjam) {
        this.id_pinjam = id_pinjam;
    }

    public Integer getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(Integer id_anggota) {
        this.id_anggota = id_anggota;
    }

    public Integer getId_buku() {
        return id_buku;
    }

    public void setId_buku(Integer id_buku) {
        this.id_buku = id_buku;
    }

    public String getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(String tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }

    public String getTanggal_kembali() {
        return tanggal_kembali;
    }

    public void setTanggal_kembali(String tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
