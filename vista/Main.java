package vista;
import controlador.Acciones;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int opc;
        String name, address, cel, email, apellido;
        Scanner sc = new Scanner(System.in);
        System.out.print("Defina la longitud del arreglo: ");
        Acciones acc = new Acciones(sc);
        do
        {
            System.out.println("[1] Altas\n[2] Busqueda por nombre");
            System.out.println("[3] Consulta general ordenada");
            System.out.println("[4] Consulta por apellido");
            System.out.println("[5] Consulta por dominio");
            System.out.println("[6] Salir");
            System.out.print("\n Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1:
                    System.out.print("Nombre:");
                    name = sc.nextLine();
                    name = name.toUpperCase();
                    System.out.print("Domicilio: ");
                    address = sc.nextLine();
                    System.out.print("Telefono: ");
                    cel = sc.nextLine();
                    System.out.print("Correo electronico: ");
                    email = sc.nextLine();
                    acc.altas(name, address, cel, email);
                    break;
                case 2:
                    System.out.print("Nombre a buscar: ");
                    name = sc.nextLine();
                    name = name.toUpperCase();
                    acc.consultaName(name);
                    break;
                case 3:
                    acc.consultaOrdenada();
                    break;
                case 4:
                    System.out.print("\nApellido a buscar: ");
                    apellido = sc.nextLine();
                    apellido = apellido.toUpperCase();
                    acc.consultaApellido(apellido);
                    break;
                case 5:
                    System.out.print("\nDominio a buscar: @");
                    email = sc.nextLine();
                    acc.consultaCorreo(email);
                    break;
                case 6:
                    System.out.println("\nAdios");
                    break;
                default:
                    System.out.println("\nOpcion invalida\n");
            }
        }while(opc != 6);
    }
}
