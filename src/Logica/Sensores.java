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
public abstract class Sensores {
   protected String marca;
   protected String referencia;
   protected String fechaInst;

    public Sensores(String marca, String referencia, String fechaInst) {
        this.marca = marca;
        this.referencia = referencia;
        this.fechaInst = fechaInst;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFechaInst() {
        return fechaInst;
    }

    public void setFechaInst(String fechaInst) {
        this.fechaInst = fechaInst;
    }

    public abstract String listar();

}
