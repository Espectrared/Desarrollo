package controlador;

import modelo.Directorio;
import vista.Main;
import java.util.Scanner;
public class Acciones
{
    Directorio[] array;
    int limit;
    int size;
    public Acciones(Scanner sc)
    {
        this.limit = 0;
        this.size = sc.nextInt();
        array = new Directorio[size];
    }
    public void altas(String name, String address, String cel, String email)
    {
        if(limit >= size)
        {
            System.out.println("\nEl arreglo se ha llenado isaac");
        }
        else
        {
            array[limit] = new Directorio(name,address,cel,email);
            limit++;
        }
    }
    public void consultaGeneral(Directorio array)
    {
        System.out.println("\nNombre: " + array.getname());
        System.out.println("Direccion: " + array.getaddress());
        System.out.println("Telefono: " + array.getcel());
        System.out.println("Correo electronico: " + array.getemail());
    }
    public void consultaName(String name)
    {
        int band=-1;
        for(int x=0; x<limit; x++)
        {
            if(array[x].getname().equals(name))
            {
                consultaGeneral(array[x]);
                band=x;
            }
        }
        if(band == -1)
            System.out.println("No encontrado");
    }
    public void consultaOrdenada()
    {
        Directorio aux;
        for(int x=1; x<limit; x++)
        {
            for(int y=0; y<limit-x; y++)
            {
                if(array[y].getname().compareTo(array[y+1].getname())>0)
                {
                    aux = array[y+1];
                    array[y+1] = array[y];
                    array[y] = aux;
                }
            }
        }
        for(int x=0; x<limit; x++)
        {
            consultaGeneral(array[x]);
        }
    }

    public void consultaApellido(String apellido)
    {
        int band=-1;
        for(int x=0; x<limit; x++)
        {
            String auxName = array[x].getname();
            String ap = auxName.substring(0, auxName.indexOf(" "));
            if(ap.equals(apellido)){
                System.out.println("\nNombre: " + array[x].getname());
                String three = array[x].getcel().substring(array[x].getcel().length() - 3);
                System.out.println("Ultimos 3 digitos de telefono: " + three);
                band=x;
            }
        }
        if(band == -1)
            System.out.println("No se encontro el apellido");
    }

    public void consultaCorreo(String email){
        int band=-1;
        for(int x=0; x<limit; x++){
            String auxMail = array[x].getemail();
            String dom = auxMail.substring(auxMail.indexOf("@")+1);
            if(dom.equalsIgnoreCase(email)){
                System.out.println("\nNombre: " + array[x].getname());
                String user = array[x].getemail().substring(0, array[x].getemail().indexOf('@'));
                System.out.println("Cuenta: " + user);
                band=x;
            }
        }
        if(band == -1)
            System.out.println("No se encontraron usuarios con el dominio");
    }
}
