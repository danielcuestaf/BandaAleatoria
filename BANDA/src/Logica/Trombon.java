/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Trombon implements Instrumento{

    @Override
    public void afinar() {
        System.out.println("afinando trombon");
    }

    @Override
    public void tocar() {
        System.out.println("tocando trombon");
    }
    
}
