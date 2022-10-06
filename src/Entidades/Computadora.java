/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Emuns.Estado;
import Emuns.Marca;
import Emuns.Memoria;
import Emuns.Procesador;

/**
 *
 * @author Gaston Rojas
 */
public class Computadora extends ElementoInformatico{
    
    Procesador procesador;
    Memoria memoria;

    public Computadora(Procesador procesador, Memoria memoria, int id, Marca marca, boolean garantia, String sector, Estado estado) {
        super(id, marca, garantia, sector, estado);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Computadora: " + "procesador=" + procesador + ", memoria=" + memoria + "\n" + super.toString();
    }

   
    
}
