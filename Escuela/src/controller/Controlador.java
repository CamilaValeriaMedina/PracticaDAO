package controller;

import factory.EstudianteDAO;
import model.Estudiante;
import view.Vista;


public class Controlador {
    Vista vista = new  Vista();
    EstudianteDAO dao;

    public Controlador(EstudianteDAO dao) {
        this.dao = dao;
    }

    public void opciones(){

        while(true){
            vista.mostrarMenu();
            int o = vista.pedirOpcion("Elige la opcion que quieras realizar ");
            switch (o){
                case 0:
                    vista.mostrarMenu();
                case 1:
                    String nombre = vista.soliNombre();
                    String correo = vista.soliCorreo();
                    dao.insertar(new Estudiante(0, nombre, correo));
                    System.out.println("Se ha agregado exitosamente");
                break;
                case 2:
                    int id = vista.soliId();
                    dao.eliminar(id);
                    vista.mostrarMensaje("Se elimino exitosamente");
                break;
                case 3:
                    String nomb = vista.soliNombre();
                    String corr = vista.soliCorreo();
                    int id1 = vista.soliId();
                    dao.actualizar(new Estudiante(id1, nomb, corr));
                break;
                case 4:
                    int idd = vista.soliId();
                    dao.obtenerPorId(idd);
                    break;
                default:
                    System.out.println("Opcion no valida");
                break;
            }
        }
    }
}
