package lab3p2_josueespinal;

public class Administradores extends Usuarios{
    private String puesto;
    private int aniosCar;
    private double salario;
    private int aniosExp;

    public Administradores() {
    }

    public Administradores(String puesto, int aniosCar, double salario, int aniosExp) {
        this.puesto = puesto;
        this.aniosCar = aniosCar;
        this.salario = salario;
        this.aniosExp = aniosExp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAnios() {
        return aniosCar;
    }

    public void setAnios(int aniosCar) {
        this.aniosCar = aniosCar;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    @Override
    public String toString() {
        return "Administradores{" + "puesto=" + puesto + ", anios=" + aniosCar + ", salario=" + salario + ", aniosExp=" + aniosExp + '}';
    }
    
}
