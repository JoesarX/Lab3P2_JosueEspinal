package lab3p2_josueespinal;

import java.util.ArrayList;

public class Restaurante {
    private String ubicaion;
    private String nombre;
    private String rtn;
    private String slogan;
    private ArrayList<Comidas> com = new ArrayList();

    public Restaurante() {
    }

    public Restaurante(String ubicaion, String nombre, String rtn, String slogan) {
        this.ubicaion = ubicaion;
        this.nombre = nombre;
        this.rtn = rtn;
        this.slogan = slogan;
    }

    public String getUbicaion() {
        return ubicaion;
    }

    public void setUbicaion(String ubicaion) {
        this.ubicaion = ubicaion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public ArrayList<Comidas> getCom() {
        return com;
    }

    public void setCom(Comidas a) {
        this.com.add(a);
    }

    @Override
    public String toString() {
        return "Restaurante{" + "ubicaion=" + ubicaion + ", nombre=" + nombre + ", rtn=" + rtn + ", slogan=" + slogan + ", com=" + com + '}';
    }
    
}
