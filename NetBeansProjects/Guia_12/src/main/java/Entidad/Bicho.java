/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interfaz.Acciones;

/**
 *
 * @author Usuario
 */
public class Bicho implements Acciones {
    
    @Override
    public void caminar() {
        System.out.println("Caminó 20km");
    }
    
}
