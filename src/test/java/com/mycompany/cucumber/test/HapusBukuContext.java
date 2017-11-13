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
public class HapusBukuContext {
    String respon;

    @Dengan("^Data buku yang akan dihapus tersedia di database$")
    public void Data_buku_yang_akan_dihapus_tersedia_di_database() throws Throwable {
        boolean expected = false;
        //berisi code untuk mengecek buku di database apakah sudah tersedia
        boolean result = false;
        assertEquals(expected, result);
    }

    @Ketika("^Memasukkan data buku yang akan dihapus dengan judul \"([^\"]*)\"$")
    public void Memasukkan_data_buku_yang_akan_dihapus_dengan_judul(String arg1) throws Throwable {
        respon = Buku.hapusBuku(arg1);
    }

    @Maka("^respon sukses hapus dengan pesan \"([^\"]*)\"$")
    public void respon_sukses_hapus_dengan_pesan (String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }

    @Maka("^respon gagal hapus dengan pesan \"([^\"]*)\"$")
    public void respon_gagal_hapus_dengan_pesan(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }

}
