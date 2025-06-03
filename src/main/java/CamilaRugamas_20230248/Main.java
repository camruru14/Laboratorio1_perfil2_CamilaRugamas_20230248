package CamilaRugamas_20230248;

import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stocks demo = new Stocks();
        System.out.println("Listado");
        demo.ListadoProductos();

        while (true) {
            System.out.println("\n--- Sistema de Inventario ---");
            System.out.println("1. Consultar stock de un producto");
            System.out.println("2. Listar productos con stock bajo (< 10 unidades)");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            int opcion = sc.nextInt();

           if (opcion == 2) {
                StockBajo();
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

    }
}