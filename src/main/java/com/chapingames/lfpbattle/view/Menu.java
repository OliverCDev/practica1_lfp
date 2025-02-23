package com.chapingames.lfpbattle.view;

import java.util.Scanner;

public class Menu {
     private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("============================");
            System.out.println("      LFP Battle Menu       ");
            System.out.println("============================");
            System.out.println("1. Cargar archivo");
            System.out.println("2. Jugar");
            System.out.println("3. Generar reporte de mayor ataque");
            System.out.println("4. Generar reporte de mayor defensa");
            System.out.println("5. Mostrar información del desarrollador");
            System.out.println("6. Salir");
            System.out.println("============================");
            System.out.print("Seleccione una opción: ");

            opcion = obtenerOpcion();

            switch (opcion) {
                case 1:
                    cargarArchivo();
                    break;
                case 2:
                    jugar();
                    break;
                case 3:
                    generarReporteMayorAtaque();
                    break;
                case 4:
                    generarReporteMayorDefensa();
                    break;
                case 5:
                    mostrarInformacionDesarrollador();
                    break;
                case 6:
                    System.out.println("¡Gracias por jugar LFP Battle! ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println();

        } while (opcion != 6);
    }

    private int obtenerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
            return -1;
        }
    }

    private void cargarArchivo() {
        System.out.println("Funcionalidad para cargar archivo aún no implementada.");
    }

    private void jugar() {
        System.out.println("Funcionalidad para jugar aún no implementada.");
    }

    private void generarReporteMayorAtaque() {
        System.out.println("Funcionalidad para generar reporte de mayor ataque aún no implementada.");
    }

    private void generarReporteMayorDefensa() {
        System.out.println("Funcionalidad para generar reporte de mayor defensa aún no implementada.");
    }

    private void mostrarInformacionDesarrollador() {
        System.out.println("Desarrollado por: [Tu Nombre]");
        System.out.println("Carnet: [Tu Carnet]");
    }
}
