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
    public static void main(String[]args){
        System.out.println("Test buku");
    }
    
    public static String addBuku(String book){
        if (book.equals("impal"))
            return "Buku berhasil dimasukkan";
        else
            return "Buku gagal dimasukkan";
    }
    
    public static String hapusBuku(String book){
        if (book.equals("impal"))
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
        if (book.equals("dzulfi"))
            return "Data kategori buku ditemukan";
        else
            return "Data kategori buku tidak ditemukan";
    }

    public static String pengembalianBuku(String book) {
          if (book.equals("impal"))
            return "Buku berhasil dikembalikan";
        else
            return "Buku gagal dikembalikan";
    }
    
}
