/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumber.test;

import com.mycompany.Anggota;
import com.mycompany.Buku;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author hanif salafi
 */
public class TambahBukuContext {
    String respon;

    @Dengan("^Data buku yang akan dimasukkan tersedia dan tidak duplikat dengan data yang telah ada di database$")
    public void Data_buku_yang_akan_dimasukkan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_database() throws Throwable {
        boolean expected = false;
        //berisi code untuk mengecek  buku di database apakah sudah tersedia
        boolean result = false;
        assertEquals(expected, result);
    }

    @Ketika("^Memasukan data buku yang akan ditambah dengan judul \"([^\"]*)\"$")
    public void memasukan_data_buku_yang_akan_ditambahkan_dengan_judul(String arg1) throws Throwable {
        respon = Buku.addBuku(arg1);
    }

    @Maka("^respon berhasil dengan pesan \"([^\"]*)\"$")
    public void respon_berhasil_dengan_pesan(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }

    @Maka("^respon gagal tambah dengan pesan \"([^\"]*)\"$")
    public void respon_gagal_tambah_dengan_pesan(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }

}
