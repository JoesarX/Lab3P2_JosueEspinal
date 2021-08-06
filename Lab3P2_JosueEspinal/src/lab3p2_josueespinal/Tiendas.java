package lab3p2_josueespinal;

import java.util.ArrayList;
import java.util.Date;

public class Tiendas{
    private String nombre;
    private String ubicacion;
    private int empleados;
    private int tiempoEspera;
    private ArrayList<Articulos> art = new ArrayList();

    public Tiendas() {
    }

    public Tiendas(String nombre, String ubicacion, int empleados, int tiempoEspera) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.empleados = empleados;
        this.tiempoEspera = tiempoEspera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public ArrayList<Articulos> getArt() {
        return art;
    }

    public void setArt(ArrayList<Articulos> art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return "Tiendas{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", empleados=" + empleados + ", tiempoEspera=" + tiempoEspera + ", art=" + art + '}';
    }
    
}
