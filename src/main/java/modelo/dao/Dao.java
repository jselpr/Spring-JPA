package modelo.dao;

import java.util.List;
import modelo.Persona;

public interface Dao {
    public List<Persona> getTodas();
    public void insertar(Object o);
    public void eliminar(Object o);
    public void actualizar(Object o);    
}
