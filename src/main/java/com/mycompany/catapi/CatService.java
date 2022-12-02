/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catapi;

import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author pamel
 */
public class CatService {
    //recupera gatos de THE CAT API
    public void getGatos() throws IOException {
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("text/plain");
        Request request = new Request.Builder()
                .url("https://api.thecatapi.com/v1/images/0XYvRd7oD")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        
        //Crea un formato con formato JSON7
        String gatoJson = response.body().toString();
        //Quita llave inicial y final
        gatoJson = gatoJson.substring(1,gatoJson.length());
        gatoJson = gatoJson.substring(0, gatoJson.length() -1);
        
        System.out.println("gato.Json" + gatoJson);
       /* Gson gson = new Gson();
        Cat gatos = gson.fromJson(gatoJson,Cat.class);
        
        
        
        Image image = null;
        try{
            URL url = new URL(gatos.getUrl());
            image = ImageIO.read(url); 
        }catch (Exception e){
            System.out.println("No se creo el objeto I M A G E N");
        }
     
        */
    }
    
}
