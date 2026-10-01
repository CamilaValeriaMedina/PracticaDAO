import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import factory.EstudianteDAO;
import factory.EstudianteDAOImpl;
import model.Estudiante;
import controller.Controlador;
import view.Vista;

//Falta agregar un metodo para que el usuario pueda agregar mas estudiantes por terminal
//Implementación de un CRUD para almacenar y recuperar información

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/escuela";
        String user = "root";
        String pass = "0101";



        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            EstudianteDAO dao = new EstudianteDAOImpl(conn);
            Controlador controlador = new Controlador(dao);

            // Insertar
            //dao.insertar(new Estudiante(0, "Oscar", "oscar@mail.com"));
            //Agregar aqui el metodo para insertar nuevos estudiantes
            controlador.opciones();

            // Listar
            for (Estudiante e : dao.listar()) {
                System.out.println(e.getId() + " - " + e.getNombre());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}