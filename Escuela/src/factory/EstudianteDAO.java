package factory;
import java.util.List;
import model.Estudiante;

public interface EstudianteDAO {
    void insertar(Estudiante e);
    Estudiante obtenerPorId(int id);
    List<Estudiante> listar();
    void actualizar(Estudiante e);
    void eliminar(int id);
}