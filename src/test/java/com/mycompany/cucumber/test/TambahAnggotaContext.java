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
import junit.framework.Assert;
import com.mycompany.Anggota;

/**
 *
 * @author hanif salafi
 */

public class TambahAnggotaContext {
    String respon,respon1;
    
    //---Fitur Menambahkan Data Member---  
    @Dengan("^Data member baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di database$")
    public void Data_member_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_database() throws Throwable {
        boolean expected = false;
        //kode untuk cek ke database apakah user sudah ada
        boolean result = false;//harusnya dari database.
        Assert.assertEquals(expected, result);
    }

    @Ketika("^Memasukan data member dengan nama \"([^\"]*)\"$")
    public void memasukan_data_member_dengan_nama(String arg1) throws Throwable {
        respon =Anggota.addMember(arg1);
    }

    @Maka("^respon \"([^\"]*)\"$")
    public void respon(String arg1) throws Throwable {
        //kode untuk cek ke database apakah user sudah ada
        Assert.assertEquals(arg1, respon);
    }

    @Maka("^respon gagal dengan pesan \"([^\"]*)\"$")
    public void respon_gagal_dengan_pesan(String arg1) throws Throwable {
        //kode untuk cek ke database apakah user sudah ada
        Assert.assertEquals(arg1, respon);
    }

 
}
