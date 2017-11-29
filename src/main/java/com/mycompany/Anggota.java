/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.logging.Logger;

/**
 *
 * @author hanif salafi
 */
public class Anggota {
    
    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

//    public static void main(String[] args) {
//        logger.info("Test Bdd Cucumber");
//    }

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
