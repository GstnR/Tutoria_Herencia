/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Computadora;
import Emuns.Estado;
import Emuns.Marca;
import Emuns.Memoria;
import Emuns.Procesador;
import Entidades.Impresora;
import Entidades.Monitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gaston Rojas
 */
public class Herrencia_Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro un arreglo Lista con tipo Obejtos pero que se comporte como un arrayList vacio!!!
        //esto permite que tenga una coleccion de objetos de timpos.
        List<Object> inventario = new ArrayList<>();
        
        //creo 7 variables del tipo objeto computadora, monitor e impresora
        Computadora computadora1 = new Computadora(Procesador.CORE_i9, Memoria.RAMx8G, 1, Marca.LG, true, "Administracio", Estado.STOCK);
        Computadora computadora2 = new Computadora(Procesador.CORE_i9, Memoria.RAMx8G, 2, Marca.LG, true, "Administracio", Estado.STOCK);
        Computadora computadora3 = new Computadora(Procesador.CORE_i9, Memoria.RAMx8G, 3, Marca.LG, true, "Tesorecia", Estado.STOCK);
        
        Monitor monitor1 = new Monitor(19, "Negro", "VGA/HDMI", 4, Marca.LG, true, "Administracion", Estado.STOCK);
        Monitor monitor2 = new Monitor(22, "Blanco", "HDMI", 5, Marca.SAMSUNG, true, "Administracion", Estado.STOCK);
        Monitor monitor3 = new Monitor(22, "Blanco", "HDMI", 6, Marca.SAMSUNG, true, "Administracion", Estado.STOCK);
        
        Impresora impresora = new Impresora(true, 7, Marca.HP, false, "Administracion", Estado.STOCK);
        
        //agrego los distintos objetos en una lista de objetos, con un orden distinto al declarado
        inventario.add(computadora1);
        inventario.add(monitor1);
        inventario.add(impresora);
        inventario.add(computadora2);
        inventario.add(monitor2);
        inventario.add(monitor3);
        inventario.add(computadora3);
        
        //Filtrando por tipo computadoras y monitor
        System.out.println("\nComputadores\n------------");
        for (Object object : inventario) {
            if (object instanceof Computadora) {
                System.out.println(object.toString());
            }
        }
        
        //filtro por Monitores
        System.out.println("\nMonitores\n----------------");
        for (Object object : inventario) {
            if(object instanceof Monitor){
                System.out.println(object.toString());
            }
        }
        
        //filtrando por tipo impresora
        System.out.println("\nImpresoras\n---------------");
        for (Object object : inventario) {
            System.out.println("Es una impresora: " + (object instanceof Impresora));
            System.out.println(object.toString());


            }
        }  
        
    }
    

