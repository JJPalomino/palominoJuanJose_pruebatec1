package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Empleados;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    EmpleadosJpaController empleadosJpa = new EmpleadosJpaController();
    
    //Agregar Empleado
    public void agregarEmpleado(Empleados empleado){
        empleadosJpa.create(empleado);
    }
    
    //Borrar Empleado
    public void borrarEmpleado(int id){
        try {
            empleadosJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Actualizar Empleado
    public void actualizarEmpleado(Empleados empleado){
        try {
            empleadosJpa.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Leer lista de Empleados
    public List<Empleados> imprimirEmpleados(){
        return empleadosJpa.findEmpleadosEntities();
    }
    
    //Buscar empleados por id
    public Empleados buscarEmpleadosPorId(int id){
        return empleadosJpa.findEmpleados(id);
    }
}
