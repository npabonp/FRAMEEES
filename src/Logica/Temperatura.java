/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiante
 */
public class Temperatura extends Sensores {
    
    public Temperatura(String marca, String referencia, String fechaInst) {
        super(marca, referencia, fechaInst);
    }
    
    @Override
    public String listar() {
      return super.toString();  
    }
}
