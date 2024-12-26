  
package com.hackaboss.pruebatecnicauno;

import java.util.Scanner;
import logica.Empleados;

public class MenuGestionEmpleados {
    Empleados empleados = new Empleados();
    
    public void opciones(){
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||                      M E N U  P R I N C I P A L                      ||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||   1.- Agregar Empleados                                              ||||");
        System.out.println("||||   2.- Actualizar datos                                               ||||");
        System.out.println("||||   3.- Borrar Empleado                                                ||||");
        System.out.println("||||   4.- Mostrar Empleados                                              ||||");
        System.out.println("||||   5.- Buscar por cargo                                               ||||");
        System.out.println("||||   6.- Salir del menú principal                                       ||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    public void menuAgregarEmpleado(){
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||                            Agregar Empleados                             ||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    
    public void menuActualizarDatos(){
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||                      Altualizar Datos de Empleado                        ||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||   1.- Actualizar Nombre                                              ||||");
        System.out.println("||||   2.- Actualizar Apellido                                            ||||");
        System.out.println("||||   3.- Actualizar Cargo                                               ||||");
        System.out.println("||||   4.- Actualizar Salario                                             ||||");
        System.out.println("||||   5.- Actualizar Fecha de Inicio                                     ||||");
        System.out.println("||||   6.- Regresar al menú principal                                     ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    
    public void menuEliminarEmpleado(){
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||                              Borrar Empleado                             ||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||Ingrese el ID del empleado                                                ||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    
    public void menuMostrarEmpleados(){
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||                        Empleados en existencia                           ||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    
    public void menuBuscarPorCargo(){
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||                        Empleados en existencia                           ||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||Ingrese el cargo del empleado                                             ||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    
    public void mensajeDefault(){
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||            La opción que ingreso no se encuentra en el menu              ||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    
    public void mensajeExcepcion(){
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||                        No puede ingresar letras                          ||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    
    public void menuEmpleadoAgregado(){
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||                      Empleados agregado correctamente                    ||");
        System.out.println("||||                                                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
    }
    
    public void nombreEmpleado(){
        
    }
    
    
    public static Scanner tecladoScanner(){
        return new Scanner(System.in);
    }

    
}
