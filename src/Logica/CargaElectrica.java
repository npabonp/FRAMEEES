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
public class CargaElectrica extends Sensores {
    private int nivelesCarga;

    public CargaElectrica(int nivelesCarga, String marca, String referencia, String fechaInst) {
        super(marca, referencia, fechaInst);
        this.nivelesCarga = nivelesCarga;
    }

    public int getNivelesCarga() {
        return nivelesCarga;
    }

    public void setNivelesCarga(int nivelesCarga) {
        this.nivelesCarga = nivelesCarga;
    }

    @Override
    public String listar() {
    return "CargaElectrica{" + "nivelesCarga=" + nivelesCarga + '}'+super.toString();  
    }
    
}
