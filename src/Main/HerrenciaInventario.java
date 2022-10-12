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
import Entidades.ElementoInformatico;
import Entidades.Impresora;
import Entidades.Monitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gaston Rojas
 */
public class HerrenciaInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        se declara un arreglo Lista con tipo ElementoInformatico
        esto permite que tenga una coleccion de elemmentos informaticos y poder utilizar
        la abstraccion de metodos
        */ 
        List<ElementoInformatico> inventario = new ArrayList<>();
        
        
        //creo 7 variables del tipo objeto computadora, monitor e impresora
        Computadora computadora1 = new Computadora(Procesador.CORE_i9, Memoria.RAMx8G, 1, Marca.SAMSUNG, true, "Administracio", Estado.STOCK);
        Computadora computadora2 = new Computadora(Procesador.AMD, Memoria.RAMx8G, 2, Marca.DELL, true, "Administracio", Estado.STOCK);
        Computadora computadora3 = new Computadora(Procesador.CORE_i3, Memoria.RAMx8G, 3, Marca.LENOVO, true, "Tesorecia", Estado.STOCK);
        
        Monitor monitor1 = new Monitor(19, "Negro", "VGA/HDMI", 4, Marca.LG, true, "Administracion", Estado.STOCK);
        Monitor monitor2 = new Monitor(22, "Blanco", "HDMI", 5, Marca.HP, true, "Administracion", Estado.OPERATIVO);
        Monitor monitor3 = new Monitor(22, "Blanco", "HDMI", 6, Marca.DELL, true, "Administracion", Estado.OPERATIVO);
        
        Impresora impresora = new Impresora(true, 7, Marca.HP, false, "Administracion", Estado.OPERATIVO);
        
        
        //agrego los distintos objetos en una lista de objetos, con un orden distinto al declarado
        inventario.add(computadora1);
        inventario.add(monitor1);
        inventario.add(impresora);
        inventario.add(computadora2);
        inventario.add(monitor2);
        inventario.add(monitor3);
        inventario.add(computadora3);
        
        //Uso un for each para poder recorrer el la lista y utilizar el metodo declarado en las clases hijas.
        System.out.println("Ejecuntando el metodo mostrar en la definicion del\n metodo abstracto por cada clase hija");
        for (ElementoInformatico elementoInformatico : inventario) {
            
            elementoInformatico.mostrarElementoInformatico();
            pausa();
        }
        
        }

    private static void pausa() {
        System.out.println("\nPresione una tecla para Continuar...");
          new java.util.Scanner(System.in).nextLine();
    }
        
    }
    

