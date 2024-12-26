package com.hackaboss.pruebatecnicauno;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import logica.Empleados;

import persistencia.ControladoraPersistencia;

public class PruebaTecnicaUno {

    public static void main(String[] args) {
        menuPrincipal();
        
    }
    
    public static void menuPrincipal(){
        MenuGestionEmpleados menuGestion = new MenuGestionEmpleados();
        Empleados empleados = new Empleados();
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        MenuValidaciones menuValidaciones = new MenuValidaciones();
        empleados = menuValidaciones.instanciaEmpleados();
        

        boolean estado = false;
        
        while(!estado){
            
            menuGestion.opciones();
            int idTeclado;
            Scanner teclado = tecladoScanner();
            
            try {
                int opcion = teclado.nextInt();
                
                switch (opcion) {
                case 1:
                    menuGestion.menuAgregarEmpleado();
                    menuValidaciones.validacionNombre();
                    menuValidaciones.validacionApellido();
                    menuValidaciones.validacionCargo();
                    menuValidaciones.validacionSalario();
                    menuValidaciones.validarFecha();
                    controlPersis.agregarEmpleado(empleados);
                    menuGestion.menuEmpleadoAgregado();
                    break;
                    
                case 2:
                    menuGestion.menuActualizarDatos();
                    subMenuActualizarDatos();
                    break;
                    
                case 3:
                    menuGestion.menuEliminarEmpleado();
                    System.out.println("id: " );
                    idTeclado = teclado.nextInt();
                    controlPersis.borrarEmpleado(idTeclado);  
                    break;
                    
                case 4:
                    menuGestion.menuMostrarEmpleados();
                        List<Empleados> listaEmpleados = controlPersis.imprimirEmpleados();
                    for (Empleados emp : listaEmpleados) {
                        System.out.println("Empleados: " + emp.getNombre());
        
         }
                    break;
                    
                case 5:
                    menuGestion.menuBuscarPorCargo();
                    break;
                    
                case 6:
                    estado = true;
                    break;
                    
                default:
                    menuGestion.mensajeDefault();
                }
            } catch (InputMismatchException e) {
                menuGestion.mensajeExcepcion();
                teclado.next();
            }
        }
    }
    
    //Método para 
    public static void subMenuActualizarDatos(){
        MenuGestionEmpleados menuGestion = new MenuGestionEmpleados();
        Empleados empleado = new Empleados();
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        MenuValidaciones menuValidaciones = new MenuValidaciones();
      
        menuValidaciones.validarIdParaActualizar();
        
        boolean estado = false;
        
        while(!estado){
            Scanner teclado = tecladoScanner();
            menuGestion.menuActualizarDatos();
            try {
                int opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        menuValidaciones.actualizarNombre(empleado);
                        break;
                        
                    case 2:
                        menuValidaciones.actualizarApellido(empleado);
                        break;
                        
                    case 3:
                        menuValidaciones.actualizarCargo(empleado);
                        break;
                        
                    case 4:
                        menuValidaciones.actualizarSalario(empleado);
                        break;
                        
                    case 5:
                        menuValidaciones.actualizarFecha(empleado);
                        break;
                        
                    case 6:
                        estado = true;
                        break;
                    default:
                        menuGestion.mensajeDefault();
                }
            } catch (InputMismatchException e) {
                menuGestion.mensajeExcepcion();
            }
        }
    }
      
    //Método que crea un Scanner
    public static Scanner tecladoScanner(){
        return new Scanner(System.in);
    }

    
}