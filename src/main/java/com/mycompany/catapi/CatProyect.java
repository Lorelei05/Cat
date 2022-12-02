/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catapi;

import java.io.IOException;

/**
 *
 * @author pamel
 */
public class CatProyect {
    
    public static void main(String[] args) throws IOException {
        CatService catService = new CatService();
        catService.getGatos();
    }
    
}
