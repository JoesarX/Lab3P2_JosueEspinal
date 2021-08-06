package lab3p2_josueespinal;

public class Clientes extends Usuarios{
    private String domicilio;
    private int pedidos;

    public Clientes(String domicilio, int pedidos) {
        this.domicilio = domicilio;
        this.pedidos = pedidos;
    }

    public Clientes() {
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Clientes{" + "domicilio=" + domicilio + ", pedidos=" + pedidos + '}';
    }
    
}
