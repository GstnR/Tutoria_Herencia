/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Emuns.Estado;
import Emuns.Marca;

/**
 *
 * @author Gaston Rojas
 */
public final class Impresora extends Elemento_Informatico{
    
    boolean tintaColor;

    public Impresora(boolean color, int id, Marca marca, boolean garantia, String sector, Estado estado) {
        super(id, marca, garantia, sector, estado);
        this.tintaColor = color;
    }

    @Override
    public String toString() {
        return "Impresora " + "color=" + tintaColor + "\n" + super.toString();
    }
    
    
    
}
