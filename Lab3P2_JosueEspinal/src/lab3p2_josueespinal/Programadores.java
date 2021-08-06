package lab3p2_josueespinal;

public class Programadores extends Usuarios{
    private String puesto;
    private int aniosCar;
    private double salario;
    private String lenguaje;
    private String horario;

    public Programadores() {
    }

    public Programadores(String puesto, int aniosCar, double salario, String lenguaje, String horario) {
        this.puesto = puesto;
        this.aniosCar = aniosCar;
        this.salario = salario;
        this.lenguaje = lenguaje;
        this.horario = horario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Programadores{" + "puesto=" + puesto + ", aniosCar=" + aniosCar + ", salario=" + salario + ", lenguaje=" + lenguaje + ", horario=" + horario + '}';
    }
}
