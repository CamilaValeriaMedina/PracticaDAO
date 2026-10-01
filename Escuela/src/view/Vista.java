package view;

import java.util.Scanner;

public class Vista {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("0. Salir");
        System.out.println("1. Insertar estudiante");
        System.out.println("2. Eliminar estudiante");
        System.out.println("3. Actualizar estudiante");
        System.out.println("4. Mostrar por ID");
    }

    public int pedirOpcion(String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    public String soliNombre(){
        System.out.println("Ingrese el nombre del estudiante");
        return sc.next();
    }

    public String soliCorreo(){
        System.out.println("Ingrese el correo del estudiante");
        return sc.next();
    }

    public int soliId(){
        System.out.println("Ingrese el id del estudiante");
        return sc.nextInt();
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void closeScanner(){
        sc.close();
    }

}
