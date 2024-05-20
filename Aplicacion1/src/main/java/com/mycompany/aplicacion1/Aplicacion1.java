/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion1;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author MatiasMiretto
 */
public class Aplicacion1 {
    

    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Elija una opción:");
            System.out.println("1. Introducir los productos");
            System.out.println("2. Visualizarlos en pantalla");
            System.out.println("3. Guardar archivo de texto");
            System.out.println("4. Leer archivo");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el código del producto:");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Introduzca la descripción del producto:");
                    String descripcion = scanner.nextLine();
                    System.out.println("Introduzca el peso del producto:");
                    double peso = scanner.nextDouble();
                    scanner.nextLine(); 
                    Producto producto = new Producto(codigo, descripcion, peso);
                    productos.add(producto);
                    break;
                case 2:
                    System.out.println("Productos almacenados:");
                    for (Producto p : productos) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    try {
                        FileWriter fileWriter = new FileWriter("productos.txt");
                        PrintWriter printWriter = new PrintWriter(fileWriter);

                        for (Producto p : productos) {
                            printWriter.println(p.getCodigo() + ";" + p.getDescripcion() + ";" + p.getPeso());
                        }

                        printWriter.close();
                        System.out.println("Productos guardados en el archivo 'productos.txt'.");
                    } catch (IOException e) {
                        System.out.println("Error al guardar el archivo.");
                    }
                    break;
                case 4:
                    try {
                        File archivo = new File("productos.txt");
                        if (Desktop.isDesktopSupported()) {
                            Desktop.getDesktop().open(archivo);
                        } else {
                            System.out.println("No se puede abrir el archivo. Su plataforma no admite la apertura de archivos.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error al abrir el archivo.");
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

        
      
    

    