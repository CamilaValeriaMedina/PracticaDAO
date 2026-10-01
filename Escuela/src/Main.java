import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import factory.EstudianteDAO;
import factory.EstudianteDAOImpl;
import model.Estudiante;

//Falta agregar un metodo para que el usuario pueda agregar mas estudiantes por terminal
//Implementación de un CRUD para almacenar y recuperar información

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/escuela";
        String user = "root";
        String pass = "0101";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            EstudianteDAO dao = new EstudianteDAOImpl(conn);

            // Insertar
            dao.insertar(new Estudiante(0, "Oscar", "oscar@mail.com"));

            // Listar
            for (Estudiante e : dao.listar()) {
                System.out.println(e.getId() + " - " + e.getNombre());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}