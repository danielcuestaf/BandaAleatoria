/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Banda {
    int x;
    ArrayList <Musico> musicos = new ArrayList <Musico>();   
    
    public void crearBanda(){
        Random r = new Random();
        int cantidad = r.nextInt(20);
        for (int i = 1; i < cantidad; i++) {
            musicos.add(new Musico());
            
        }
        x = 0;
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.asignarInstrumento(this.generarInstrumento(r.nextInt(8)));
            x++;
            
        }
    }
    public void totalMusicos(){
        System.out.println("el total de musicos es: " + x);
    }
    public void afinarBanda(){
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.afinarInstrumento();
        }
    }
    
    public void tocarBanda(){
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.tocarInstrumento();
            
        }
    }
    private Instrumento generarInstrumento(int aleatorio){
        switch(aleatorio){
            case 1:
                return new Guitarra();
                
            case 2:
                return new Guacharaca();
            case 3:
                return new Piano();
            case 4:
                return new Saxofon();
            case 5:
                return new Trompeta();
            case 6:
                return new Trombon();
            case 7:
                return new Flauta();
            default:
                return new Violin();
        }
        
    }
}

