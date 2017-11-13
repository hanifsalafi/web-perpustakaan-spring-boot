/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author ristek
 */
public class Buku {

    Buku (Buku buku){
    }
    
    public static String addBuku(String book){
        if (book.equals("matdis"))
            return "Buku berhasil dimasukkan";
        else
            return "Buku gagal dimasukkan";
    }
    
    public static String hapusBuku(String book){
        if (book.equals("dap"))
            return "Buku Berhasil Dihapus";
        else
            return "Buku Tidak Ditemukan";
    }
     
     
    public static String cariBuku(String book){
        if (book.equals("impal"))
            return "Data buku ditemukan";
        else
            return "Data buku tidak ditemukan";
    }
    
    public static String updateBuku(String book){
        if (book.equals("dzulfi"))
            return "Data buku ditemukan";
        else
            return "Data buku tidak ditemukan";
    }
    
        public static String lihatKatalog(String book){
        if (book.equals("Edukasi"))
            return "Buku Ditemukan";
        else
            return "Buku Tidak Ditemukan";
    }

    public static String pengembalianBuku(String book) {
          if (book.equals("daa"))
            return "Buku berhasil dikembalikan";
        else
            return "Buku gagal dikembalikan";
    }
    
    public static String pinjamBuku(String book, String nama) {
          if (book.equals("tba") && nama.equals("dzulfi") )
            return "Peminjaman Berhasil";
        else
            return "Peminjaman Gagal";
    }
    
}
