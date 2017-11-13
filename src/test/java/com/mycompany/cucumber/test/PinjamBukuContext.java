package com.mycompany.cucumber.test;

import com.mycompany.Anggota;
import com.mycompany.Buku;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dan;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import static junit.framework.Assert.assertEquals;

public class PinjamBukuContext {
    String respon,respon1;

    //---Fitur Mencari Data Member---
    @Dengan("^Data buku yang telah tersedia di database$")
    public void Dengan_Data_buku_yang_telah_tersedia_di_database() throws Throwable {
        boolean expected = false;
        //berisi code untuk mengecek user di database apakah sudah tersedia
        boolean result = false;
        assertEquals(expected, result);
    }

    @Ketika("^input data member dengan nama \"([^\"]*)\"$")
    public void Ketika_input_data_member_dengan_nama(String arg1) throws Throwable {
        respon = arg1;
    }
    
    @Dan("^input data buku dengan judul \"([^\"]*)\"$")
    public void Dan_input_data_buku_dengan_judul(String arg1) throws Throwable {
        respon1 =Buku.pinjamBuku(arg1,respon);
    }

    @Maka("^respon dari sistem adalah \"([^\"]*)\"$")
    public void respon_dari_sistem_adalah(String arg1) throws Throwable {
        assertEquals(arg1, respon1);
    }

    @Maka("^respon dari sistem iyalah \"([^\"]*)\"$")
    public void respon_dari_sistem_iyalah(String arg1) throws Throwable {
        assertEquals(arg1, respon1);
    }
}
