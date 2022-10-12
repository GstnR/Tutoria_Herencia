
package Entidades;

import Emuns.Estado;
import Emuns.Marca;

/**
 *
 * @author Gaston Rojas
 */
public abstract class ElementoInformatico {
    
    private int id;
    private Marca marca;
    private boolean garantia;
    private String sector;
    private Estado estado;

    public ElementoInformatico(int id, Marca marca, boolean garantia, String sector, Estado estado) {
        this.id = id;
        this.marca = marca;
        this.garantia = garantia;
        this.sector = sector;
        this.estado = estado;
    }

    private int getId() {
        return id;
    }

    private Marca getMarca() {
        return marca;
    }

    private boolean isGarantia() {
        return garantia;
    }

    private String getSector() {
        return sector;
    }

    private Estado getEstado() {
        return estado;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setMarca(Marca marca) {
        this.marca = marca;
    }

    private void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    private void setSector(String sector) {
        this.sector = sector;
    }

    private void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Elemento id=" + id + ", marca=" + marca + ", garantia=" + garantia + ", sector=" + sector + ", estado=" + estado +"\n";
    }
    
     public abstract void mostrarElementoInformatico();
    
    
}
