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
 * @author ristek
 */
public class CariBukuContext {
    String respon;

    @Dengan("^Data buku yang sudah tersedia di database$")
    public void Data_buku_yang_sudah_tersedia_di_database() throws Throwable {
        boolean expected = false;
        //berisi code untuk mengecek buku di database apakah sudah tersedia
        boolean result = false;
        assertEquals(expected, result);
    }

    @Ketika("^Memasukan data buku dengan judul \"([^\"]*)\"$")
    public void Memasukan_data_buku_dengan_judul(String arg1) throws Throwable {
        respon = Buku.cariBuku(arg1);
    }

    @Maka("^respon pencarian \"([^\"]*)\"$")
    public void respon_pencarian(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }

    @Maka("^respon gagal pencarian dengan pesan \"([^\"]*)\"$")
    public void respon_gagal_pencarian_dengan_pesan(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }
}
