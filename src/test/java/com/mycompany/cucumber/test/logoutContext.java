/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumber.test;

import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

/**
 *
 * @author hanif salafi
 */

public class logoutContext {
    
    WebDriver driver  = new FirefoxDriver();

    @Dengan("^berada di dalam website perpustakaan$")
    public void berada_di_dalam_website_perpustakaan() throws Throwable {
         driver.navigate().to("http://localhost:8080/");         
    }

    @Ketika("^di klik tombol logout$")
    public void di_klik_tombol_logout() throws Throwable {
        driver.findElement(By.id("logout")).click();
    }
    
    @Maka("^akan keluar dari website$")
    public void akan_keluar_dari_website() throws Throwable {
        driver.quit();
    }

}
