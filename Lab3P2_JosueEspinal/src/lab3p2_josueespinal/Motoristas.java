package lab3p2_josueespinal;

public class Motoristas extends Usuarios{
    private int aniosCar;
    private double salario;
    private double comisiones;
    private String transporte;
    private int encargos;

    public Motoristas() {
    }

    public Motoristas(int aniosCar, double salario, double comisiones, String transporte, int encargos) {
        this.aniosCar = aniosCar;
        this.salario = salario;
        this.comisiones = comisiones;
        this.transporte = transporte;
        this.encargos = encargos;
    }

    public int getAniosCar() {
        return aniosCar;
    }

    public void setAniosCar(int aniosCar) {
        this.aniosCar = aniosCar;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public int getEncargos() {
        return encargos;
    }

    public void setEncargos(int encargos) {
        this.encargos = encargos;
    }

    @Override
    public String toString() {
        return "Motoristas{" + "aniosCar=" + aniosCar + ", salario=" + salario + ", comisiones=" + comisiones + ", transporte=" + transporte + ", encargos=" + encargos + '}';
    }
    
}
