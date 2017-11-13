/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumber.test;


import com.mycompany.Anggota;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import junit.framework.Assert.*;
import com.mycompany.Anggota;
import static junit.framework.Assert.*;

/**
 *
 * @author hanif salafi
 */

public class CariAnggotaContext {
    String respon;

    //---Fitur Mencari Data Member---
    @Dengan("^Data member yang sudah tersedia di database$")
    public void Data_member_yang_sudah_tersedia_di_database() throws Throwable {
        boolean expected = false;
        //berisi code untuk mengecek user di database apakah sudah tersedia
        boolean result = false;
        assertEquals(expected, result);
    }

    @Ketika("^Memasukan nama member \"([^\"]*)\"$")
    public void Memasukan_nama_member(String arg1) throws Throwable {
        respon =Anggota.editMember(arg1);
    }

    @Maka("^respon dari sistem \"([^\"]*)\"$")
    public void respon_dari_sistem(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }

    @Maka("^respon gagal dari sistem \"([^\"]*)\"$")
    public void respon_gagal_dari_sistem(String arg1) throws Throwable {
        assertEquals(arg1, respon);
    }


}
