
package com.hackaboss.pruebatecnicauno;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import static logica.Empleados_.nombre;
import logica.Empleados;
import logica.excepciones.ExcepcionApellidoInvalido;
import logica.excepciones.ExcepcionCargoInvalido;
import logica.excepciones.ExcepcionFechaInvalida;
import logica.excepciones.ExcepcionNombreInvalido;
import logica.excepciones.ExepcionSalarioInvalido;
import persistencia.ControladoraPersistencia;

public class MenuValidaciones {
    private MenuGestionEmpleados menuGestion;
    private Empleados instEmpleados;
    private ControladoraPersistencia instaControladoraPersis;
    
    public void validacionNombre(){
        Scanner teclado = tecladoScanner();     
        String nombre = null;
        boolean validacion = false;
                    
        while (validacion != true) {
            try {                
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el nombre del empleado:                                               ");
                nombre = teclado.nextLine();
                System.out.println("------------------------------------------------------------------------------");
                validarNombre(nombre);
                validacion = true;
                instanciaEmpleados().setNombre(nombre);
            } catch (ExcepcionNombreInvalido e) {
                System.out.println(e.getMessage());
            }
        }  
    }
    
    public void validacionApellido(){
        Scanner teclado = tecladoScanner();
        String apellido = null;
        boolean validacion = false;
    
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el apellido del empleado:                                             ");
                apellido = teclado.nextLine();
                System.out.println("------------------------------------------------------------------------------");
                validarApellido(apellido);
                validacion = true;
                instanciaEmpleados().setApellido(apellido);
            } catch (ExcepcionApellidoInvalido e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
    
    public void validacionCargo(){
        Scanner teclado = tecladoScanner();
        String cargo = null;
        boolean validacion = false;
        
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el cargo del empleado:                                                ");
                cargo = teclado.nextLine();
                System.out.println("------------------------------------------------------------------------------");
                validarCargo(cargo);
                validacion = true;
                instanciaEmpleados().setCargo(cargo);
            } catch (ExcepcionCargoInvalido e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void validacionSalario(){
        Scanner teclado = tecladoScanner();
        double salario = 0.0;
        boolean validacion = false;
        
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el salario del empleado:                                              ");
                salario = Double.parseDouble(teclado.nextLine());
                System.out.println("------------------------------------------------------------------------------");
                
                validarSalario(salario);
                validacion = true;
                instanciaEmpleados().setSalario(salario);
                
            } catch (ExepcionSalarioInvalido e) {
                System.out.println(e.getMessage());
            }
        } 
    }
    
    public void validarFecha(){
        Scanner teclado = tecladoScanner();
        LocalDate fechaIngreso = null;
        boolean validacion = false;
        
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el año de ingreso del empleado.                                       ");
                int anio = teclado.nextInt();
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el mes de ingreso del empleado.                                       ");
                int mes = teclado.nextInt();
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el dia de ingreso del empleado.                                       ");
                int dia = teclado.nextInt();
                System.out.println("------------------------------------------------------------------------------");
                fechaIngreso = LocalDate.of(anio, mes, dia);
                validarFecha(fechaIngreso);
                validacion = true;
                instanciaEmpleados().setFechaInicio(fechaIngreso);
            } catch (Exception e) {
            }
        } 
    }
    
    public void validarIdParaActualizar(){
        Scanner teclado = tecladoScanner();
        boolean validacion = false;
        while(validacion != true){
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Ingrese el ID del empleado para validar:                                      ");
            int idEmpleado = teclado.nextInt();
            System.out.println("------------------------------------------------------------------------------");
            instanciaControladoraPersis();
            Empleados empleado = instaControladoraPersis.buscarEmpleadosPorId(idEmpleado);
            if (empleado != null) {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Empleado encontrado. Puede proceder a actualizar.");
                System.out.println("------------------------------------------------------------------------------");
                validacion = true;
            } else {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Error: No se encontró una persona con ID " + idEmpleado);
                System.out.println("------------------------------------------------------------------------------");
            }
        }
    }
    
    public void actualizarNombre(Empleados empleado){
        Scanner teclado = tecladoScanner();
        String nuevoNombre = null;
        boolean validacion = false;
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el nombre del empleado:                                               ");
                nuevoNombre = teclado.nextLine();
                System.out.println("------------------------------------------------------------------------------");
                validarNombre(nuevoNombre);
                empleado.setNombre(nuevoNombre);
                instanciaControladoraPersis();
                instaControladoraPersis.actualizarEmpleado(empleado);
                validacion = true;
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Nombre actualizado                                                            ");
                System.out.println("------------------------------------------------------------------------------");
            } catch (ExcepcionNombreInvalido e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void actualizarApellido(Empleados empleado){
        Scanner teclado = tecladoScanner();
        String nuevoApellido = null;
        boolean validacion = false;
        
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el apellido del empleado:                                             ");
                nuevoApellido = teclado.nextLine();
                System.out.println("------------------------------------------------------------------------------");
                validarApellido(nuevoApellido);
                empleado.setApellido(nuevoApellido);
                instanciaControladoraPersis();
                instaControladoraPersis.actualizarEmpleado(empleado);
                validacion = true;
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Apellido actualizado                                                          ");
                System.out.println("------------------------------------------------------------------------------");
            } catch (ExcepcionApellidoInvalido e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void actualizarCargo(Empleados empleado){
        Scanner teclado = tecladoScanner();
        String nuevoCargo = null;
        boolean validacion = false;
        
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el nuevo cargo del empleado:                                          ");
                nuevoCargo = teclado.nextLine();
                System.out.println("------------------------------------------------------------------------------");
                validarCargo(nuevoCargo);
                empleado.setCargo(nuevoCargo);
                instanciaControladoraPersis();
                instaControladoraPersis.actualizarEmpleado(empleado);
                validacion = true;
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Cargo actualizado                                                             ");
                System.out.println("------------------------------------------------------------------------------");
            } catch (ExcepcionCargoInvalido e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void actualizarSalario(Empleados empleado){
        Scanner teclado = tecladoScanner();
        double nuevoSalario = 0.0;
        boolean validacion = false;
        
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el nuevo salario del empleado:                                              ");
                nuevoSalario = Double.parseDouble(teclado.nextLine());
                System.out.println("------------------------------------------------------------------------------");
                validarSalario(nuevoSalario);
                empleado.setSalario(nuevoSalario);
                instanciaControladoraPersis();
                instaControladoraPersis.actualizarEmpleado(empleado);
                validacion = true;
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Salario actualizado                                                           ");
                System.out.println("------------------------------------------------------------------------------");                          
            } catch (ExepcionSalarioInvalido e) {
                System.out.println(e.getMessage());
            }
        } 
    }
    
    public void actualizarFecha(Empleados empleado){
        Scanner teclado = tecladoScanner();
        LocalDate fechaIngreso = null;
        boolean validacion = false;
        
        while(validacion != true){
            try {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el nuevo año de ingreso.                                              ");
                int anio = teclado.nextInt();
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el nuevo mes de ingreso.                                              ");
                int mes = teclado.nextInt();
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el nuevo dia de ingreso.                                              ");
                int dia = teclado.nextInt();
                System.out.println("------------------------------------------------------------------------------");
                fechaIngreso = LocalDate.of(anio, mes, dia);
                validarFecha(fechaIngreso);
                empleado.setFechaInicio(fechaIngreso);
                instanciaControladoraPersis();
                instaControladoraPersis.actualizarEmpleado(empleado);
                validacion = true;
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Fecha actualizada                                                             ");
                System.out.println("------------------------------------------------------------------------------");
            } catch (Exception e) {
            }
        }  
    }
    
    public void validarImpresionByCargo(){
        Scanner teclado = tecladoScanner();
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ingrese el cargo del empleado:                                                ");
                String buscarByCargo = teclado.nextLine();
                System.out.println("------------------------------------------------------------------------------");
        ControladoraPersistencia controladora = instanciaControladoraPersis();
        List<Empleados> empleados = controladora.imprimirEmpladosByCargo(buscarByCargo);
        
        if (empleados != null && !empleados.isEmpty()) {
             for (Empleados empleado : empleados) {
                 System.out.println("ID: " + empleado.getId());
                 System.out.println("Nombre: " + empleado.getNombre());
                 System.out.println("Apellido: " + empleado.getApellido());
                 System.out.println("Cargo: " + empleado.getCargo());
                 System.out.println("Salario: " + empleado.getSalario());
                 System.out.println("Fecha de Inicio: " + empleado.getFechaInicio());
                 System.out.println("----------------------------");
             }
         } else {
             System.out.println("No se encontraron empleados con el cargo: " + buscarByCargo);
         }
        
    }
    
    public static void recorrerLista(List<Empleados>listaEmpleados){
        for(Empleados emp:listaEmpleados){
            System.out.println(emp.toString());
        }
    }
    
    //Método que crea un Scanner
    public static Scanner tecladoScanner(){
        return new Scanner(System.in);
    }
    
    public MenuGestionEmpleados instanciaMenuGes(){
        if (menuGestion == null){
            menuGestion = new MenuGestionEmpleados();
        }
        return menuGestion;
    }
    
    public Empleados instanciaEmpleados(){
        if (instEmpleados == null){
            instEmpleados = new Empleados();
        }
        return instEmpleados;
    }
    
    public ControladoraPersistencia instanciaControladoraPersis(){
        if (instaControladoraPersis == null){
            instaControladoraPersis = new ControladoraPersistencia();
        }
        return instaControladoraPersis;
    }
            
    private void validarNombre(String nombre) throws ExcepcionNombreInvalido{
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    private void validarApellido(String apellido) throws ExcepcionApellidoInvalido{
        if(apellido == null || apellido.trim().isEmpty()){
            throw new IllegalArgumentException("El apellido no puede estar vacio");
        }
    }

    private void validarCargo(String cargo) throws ExcepcionCargoInvalido{
        if(cargo == null || cargo.trim().isEmpty()){
            throw new IllegalArgumentException("El cargo no puede estar vacio");
        }
    }

    private void validarSalario(double salario) throws ExepcionSalarioInvalido{
        if(salario <=0){
            throw new ExepcionSalarioInvalido("El salario ingresado es inválido. Debe ser mayor a 0");
        }
    }

    private void validarFecha(LocalDate fechaIngreso) throws ExcepcionFechaInvalida{
        if(fechaIngreso == null){
            throw new ExcepcionFechaInvalida("La decha ingresada es inválida");
        }
    }
    
}
