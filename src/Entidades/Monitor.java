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
public class Monitor extends ElementoInformatico{
    
    int pulgadas;
    String Color;
    String entrada;

    public Monitor(int pulgadas, String Color, String entrada, int id, Marca marca, boolean garantia, String sector, Estado estado) {
        super(id, marca, garantia, sector, estado);
        this.pulgadas = pulgadas;
        this.Color = Color;
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Monitor: \n" + "pulgadas=" + pulgadas + ", Color=" + Color + ", entrada=" + entrada + "\n"+super.toString();
    }
    
    
    
}
