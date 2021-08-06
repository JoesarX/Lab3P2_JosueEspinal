package lab3p2_josueespinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_JosueEspinal {

    public static String usuario;
    public static String contra;
    public static double precio;
    public static ArrayList<Restaurante> rest = new ArrayList();
    public static Usuarios u = new Usuarios();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rest.add(llenarRest("Tegucigalpa", "Pollo Campero", "6545347885", "Pollo bien rico"));
        rest.add(llenarRest("San Pedro Sula", "Power Chicken", "65427631276", "El pollo mas fuerte"));

        Administradores admin = new Administradores("CEO", 10, 100000, 5);
        admin.setNombre("David");
        admin.setApellido("El guapo");
        admin.setUsuario("david");
        admin.setContra("1234");
        u.setAdmin(admin);//DEFAULT ADMIN ES david - 1234
        Programadores prog = new Programadores();
        prog.setNombre("Josue");
        prog.setApellido("Espinal");
        prog.setUsuario("josue");
        prog.setUsuario("1234");
        u.setProg(prog);
        Motoristas moto = new Motoristas();
        moto.setUsuario("elMotos");
        moto.setUsuario("1234");
        u.setMoto(moto);
        Clientes clien = new Clientes();
        clien.setUsuario("persona");
        clien.setUsuario("12345");
        u.setClient(clien);
        int login = login();
        while (login != 3) {
            switch (login) {
                case 1: {
                    System.out.print("Ingrese el Usuario: ");
                    String usuario2 = sc.next();
                    System.out.print("Ingrese la contraseña: ");
                    String contra2 = sc.next();
                    int correct = comprobar(usuario2, contra2);
                    while (correct == 5) {
                        System.out.println("El usuario o la contraseña son incorrectos. Porfavor ingrese nuevamente");
                        System.out.print("Ingrese el Usuario: ");
                         usuario2 = sc.next();
                        System.out.print("Ingrese la contraseña: ");
                         contra2 = sc.next();
                        correct = 4;
                    }
                    switch (correct) {
                        case 1: {
                            System.out.println("Bienvenido Admin:");
                        }
                        break;
                        case 2: {
                            System.out.println("Bienvenido Programador:");
                        }
                        break;
                        case 3: {
                            System.out.println("Bienvenido Motorista:");
                        }
                        break;
                        case 4: {
                            System.out.println("Bienvenido Usuario:");
                            int restOTienda = menu1();
                            while (restOTienda != 3) {
                                switch (restOTienda) {
                                    case 1: {
                                        precio = 0;
                                        int restaurante = caso1();
                                        int comida = caso12(restaurante);
                                        int complemento = caso13(restaurante, comida);
                                        precio = rest.get(restaurante).getCom().get(comida).getPrecio() + rest.get(restaurante).getCom().get(comida).getAcom().get(complemento).getPrecio();
                                        System.out.println("Su precio total sera de: " + precio);
                                    }
                                    break;
                                    case 2: {

                                    }
                                    break;
                                    case 3: {

                                    }
                                    break;
                                    default: {
                                        System.out.println("La opcion elegida no es valida.");

                                    }
                                    break;
                                }
                                restOTienda = menu1();
                            }
                        }
                        break;
                    }
                }
                break;
                case 2: {
                    System.out.print("Ingrese su nombre: ");
                    u.setNombre(sc.next());
                }
                break;
            }
            login = login();
        }

    }

    public void agregarRest() {

    }

    private static int login() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("INGRESE UNA OPCION: ");
        System.out.println("1- Login\n"
                + "2- Sign Up\n"
                + "3- Salir");
        int choice = sc.nextInt();
        return choice;
    }

    private static int comprobar(String usuario, String contra) {
        int correcto = 5;
        for (int i = 0; i < u.getAdmin().size(); i++) {
            if (u.getAdmin().get(i).getUsuario().equals(usuario) && u.getAdmin().get(i).getContra().equals(contra)) {
                return 1;
            }
        }
        for (int j = 0; j < u.getProg().size(); j++) {
            if (u.getProg().get(j).getUsuario().equals(usuario) && u.getProg().get(j).getContra().equals(contra)) {
                return 2;
            }
        }
        for (int i = 0; i < u.getMoto().size(); i++) {
            if (u.getMoto().get(i).getUsuario().equals(usuario) && u.getMoto().get(i).getContra().equals(contra)) {
                return 3;
            }
        }
        for (int i = 0; i < u.getClient().size(); i++) {
            if (u.getClient().get(i).getUsuario().equals(usuario) && u.getClient().get(i).getContra().equals(contra)) {
                return 4;
            }

        }
        return correcto;
    }

    private static int menu1() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("DESEA COMPRAR DE UN RESTAURANTE O UNA TIENDA: ");
        System.out.println("1- Restaurante\n"
                + "2- Tienda\n"
                + "3- salir");
        int choice = sc.nextInt();
        return choice;
    }

    private static int caso1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DE QUE RESTAURANTE DESEA ORDENAR: ");
        String imprimir = "";
        for (int i = 0; i < rest.size(); i++) {
            imprimir += (i) + "- " + rest.get(i).getNombre() + "\n";
        }
        System.out.print(imprimir);
        int choice = sc.nextInt();
        return choice;
    }

    private static int caso12(int restaurante) {
        Scanner sc = new Scanner(System.in);
        System.out.println("QUE COMIDA DESEA ORDENAR:");
        String imprimir = "";
        for (int i = 0; i < rest.get(restaurante).getCom().size(); i++) {
            imprimir += (i) + "- " + rest.get(restaurante).getCom().get(i).getNombre() + " --- " + rest.get(restaurante).getCom().get(i).getPrecio() + " Lmps\n";
        }
        System.out.print(imprimir);
        int choice = sc.nextInt();
        return choice;
    }

    private static int caso13(int restaurante, int comida) {
        Scanner sc = new Scanner(System.in);
        System.out.println("QUE COMPLEMENTO DESEA:");
        String imprimir = "";
        for (int i = 0; i < rest.get(restaurante).getCom().get(comida).getAcom().size(); i++) {
            imprimir += (i) + "- " + rest.get(restaurante).getCom().get(comida).getAcom().get(i).getNombre() + " --- "
                    + rest.get(restaurante).getCom().get(comida).getAcom().get(i).getPrecio() + " Lmps\n";
        }
        System.out.print(imprimir);
        int choice = sc.nextInt();
        return choice;
    }

    public static Acompaniantes llenarAC(String nombre, String tipo, double precio) {
        Acompaniantes aco = new Acompaniantes(nombre, tipo, precio);
        return aco;
    }

    public static Comidas llenarCom(int ID, String nombre, double precio, int numAcom) {
        Comidas com = new Comidas(ID, nombre, precio, numAcom);
        com.setAcom(llenarAC("Papas Fritas", "frito", 70));
        com.setAcom(llenarAC("Tostones", "frito", 100));
        com.setAcom(llenarAC("Arroz", "asado", 200));
        return com;
    }

    public static Restaurante llenarRest(String ubicaion, String nombre, String rtn, String slogan) {
        Restaurante rest = new Restaurante(ubicaion, nombre, rtn, slogan);
        rest.setCom(llenarCom(68542842, "Nuggets", 200, 1));
        rest.setCom(llenarCom(56486525, "Pollo Asado", 350, 1));
        rest.setCom(llenarCom(12763475, "Verduras", 250, 1));
        return rest;
    }
}
