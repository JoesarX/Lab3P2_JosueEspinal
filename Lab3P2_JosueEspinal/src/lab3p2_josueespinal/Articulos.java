package lab3p2_josueespinal;
public class Articulos {
    private String nombre;
    private String tipo;
    private double precio;

    public Articulos() {
    }

    public Articulos(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos{" + "nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
}
