/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author hanif salafi
 */
public class Anggota {
    
    public static void main(String[] args) {
        System.out.println("Test Tambah Anggota");
    }

    public static String addMember(String user) {
        if (user.equals("hanif")) {
            return "user sukses dimasukan";
        } else {
            return "duplikat";
        }
    }

    public static String cariMember(String user) {
        if (user.equals("witsqa")) {
            return "Data member ditemukan";
        } else {
            return "Data member tidak ditemukan";
        }
    }
}
