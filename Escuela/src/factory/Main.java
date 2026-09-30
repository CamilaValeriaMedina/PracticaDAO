package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.Estudiante;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/escuela";
        String user = "root";
        String pass = "0101";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            EstudianteDAO dao = new EstudianteDAOImpl(conn);

            // Insertar
            dao.insertar(new Estudiante(0, "Oscar", "oscar@mail.com"));
            dao.insertar(new Estudiante( 1, "Juan Pérez", "juan.perez@mail.com"));
            dao.insertar(new Estudiante(2,"Ana López", "ana.lopez@mail.com"));
            dao.insertar(new Estudiante(3,"Carlos Ruiz", "carlos.ruiz@mail.com"));

            // Listar
            for (Estudiante e : dao.listar()) {
                System.out.println(e.getId() + " - " + e.getNombre());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}