/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumber.test;


import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.id.Dan;
import org.openqa.selenium.By;

/**
 *
 * @author hanif salafi
 */

public class loginContext {
    
    WebDriver driver  = new FirefoxDriver();
    
    @Dengan("^masuk ke website perpustakaan$")
    public void masuk_ke_website_perpustakaan() throws Throwable {
        driver.get("http://localhost:8080/login");         
    }
    @Maka("^masukkan username pada field username \"([^\"]*)\"$")
    public void masukkan_username_pada_field_username(String arg1) throws Throwable {
         driver.findElement(By.id("username")).sendKeys(arg1);
    }

    @Dan("^masukkan password pada field password \"([^\"]*)\"$")
    public void masukkan_password_pada_field_password(String arg1) throws Throwable {
        driver.findElement(By.id("password")).sendKeys(arg1);
    }

    @Maka("^jika di klik tombol login akan masuk ke website$")
    public void jika_di_klik_tombol_login_akan_masuk_ke_website() throws Throwable {
        driver.findElement(By.id("login")).click();
    }
    
    @Maka("^jika di klik tombol login tidak akan masuk ke website$")
    public void jika_di_klik_tombol_login_tidak_akan_masuk_ke_website() throws Throwable {
        driver.findElement(By.id("login")).click();
    }

}
