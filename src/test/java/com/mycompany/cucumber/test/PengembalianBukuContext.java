/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumber.test;

import com.mycompany.Buku;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author hanif salafi
 */
public class PengembalianBukuContext {
    String respon;

    @Dengan("^Data buku yang sudah tersedia di database dan sedang dalam masa peminjaman$")
    public void Data_buku_yang_sudah_tersedia_di_database_dan_sedang_dalam_masa_peminjaman() throws Throwable {
        boolean expected = false;
        //berisi code untuk mengecek buku di database apakah sudah tersedia
        boolean result = false;
        assertEquals(expected, result);
    }

    @Ketika("^Memasukkan data buku yang dipinjam dengan judul \"([^\"]*)\"$")
    public void Memasukkan_data_buku_yang_dipinjam_dengan_judul(String arg1) throws Throwable {
        respon = Buku.pengembalianBuku(arg1);
    }

    @Maka("^respon pengembalian \"([^\"]*)\"$")
    public void respon_pengembalian(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }

    @Maka("^respon pengembalian gagal \"([^\"]*)\"$")
    public void respon_pengembalian_gagal(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }
}
