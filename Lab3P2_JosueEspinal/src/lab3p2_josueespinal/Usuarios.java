package lab3p2_josueespinal;

import java.util.ArrayList;

public class Usuarios {
    private String Usuario;
    private String contra;
    private String nombre;
    private String apellido;
    private String ID;
    ArrayList<Administradores> admin = new ArrayList();
    ArrayList<Programadores> prog = new ArrayList();
    ArrayList<Motoristas> moto = new ArrayList();
    ArrayList<Clientes> client = new ArrayList();

    public Usuarios(String Usuario, String contra, String nombre, String apellido, String ID) {
        this.Usuario = Usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public Usuarios() {
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Administradores> getAdmin() {
        return admin;
    }

    public void setAdmin(Administradores admin) {
        this.admin.add(admin);
    }

    public ArrayList<Programadores> getProg() {
        return prog;
    }

    public void setProg(Programadores prog) {
        this.prog.add(prog);
    }

    public ArrayList<Motoristas> getMoto() {
        return moto;
    }

    public void setMoto(Motoristas moto) {
        this.moto.add(moto);
    }

    public ArrayList<Clientes> getClient() {
        return client;
    }

    public void setClient(Clientes client) {
        this.client.add(client);
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", admin=" + admin + ", prog=" + prog + ", moto=" + moto + ", client=" + client + '}';
    }
    
}
