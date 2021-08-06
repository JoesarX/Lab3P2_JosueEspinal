package lab3p2_josueespinal;

import java.util.ArrayList;

public class Comidas {
    private int ID;
    private String nombre;
    private double precio;
    private int numAcom;
    private ArrayList<Acompaniantes> acom = new ArrayList();
    
    public Comidas() {
    }

    public Comidas(int ID, String nombre, double precio, int numAcom) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.numAcom = numAcom;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumAcom() {
        return numAcom;
    }

    public void setNumAcom(int numAcom) {
        this.numAcom = numAcom;
    }

    public ArrayList<Acompaniantes> getAcom() {
        return acom;
    }

    public void setAcom(Acompaniantes a) {
        this.acom.add(a);
    }

    @Override
    public String toString() {
        return "Comidas{" + "ID=" + ID + ", nombre=" + nombre + ", precio=" + precio + ", numAcom=" + numAcom + ", acom=" + acom + '}';
    }
    
}
