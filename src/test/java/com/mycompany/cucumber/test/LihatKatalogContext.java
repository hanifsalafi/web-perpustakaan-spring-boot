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
 * @author USer
 */
public class LihatKatalogContext {
    String respon;
    @Dengan("^Data buku beserta katalognya yang sudah tersedia di database$")
    public void Data_buku_beserta_katalognya_yang_sudah_tersedia_di_database() throws Throwable {
        boolean expected = false;
        //berisi code untuk mengecek buku di database apakah sudah tersedia
        boolean result = false;
        assertEquals(expected, result);
    }

    @Ketika("^Memasukan Katalog buku \"([^\"]*)\"$")
    public void Memasukkan_Katalog_buku(String arg1) throws Throwable {
        respon = Buku.lihatKatalog(arg1);
    }

    @Maka("^respon yang akan ditampilkan \"([^\"]*)\"$")
    public void respon_yang_akan_ditampilkan(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }

    @Maka("^respon gagal akan ditampilkan \"([^\"]*)\"$")
    public void respon_gagal_akan_ditampilkan(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }
}
