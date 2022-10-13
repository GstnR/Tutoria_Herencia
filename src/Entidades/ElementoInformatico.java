package Entidades;

import Emuns.Estado;
import Emuns.Marca;

/**
 *
 * @author Gaston Rojas
 */
public abstract class ElementoInformatico {

    private int id;
    protected  Marca marca;
    protected  boolean garantia;
    protected  String sector;
    protected  Estado estado;

    public ElementoInformatico(int id, Marca marca, boolean garantia, String sector, Estado estado) {
        this.id = id;
        this.marca = marca;
        this.garantia = garantia;
        this.sector = sector;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public  Marca getMarca() {
        return marca;
    }

    public  boolean isGarantia() {
        return garantia;
    }

    public  String getSector() {
        return sector;
    }

    public  Estado getEstado() {
        return estado;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public  void setMarca(Marca marca) {
        this.marca = marca;
    }

    public  void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public  void setSector(String sector) {
        this.sector = sector;
    }

    public  void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Elemento id=" + id + ", marca=" + marca + ", garantia=" + garantia + ", sector=" + sector + ", estado=" + estado + "\n";
    }

    public abstract void mostrarElementoInformatico();
    

}
