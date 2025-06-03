package CamilaRugamas_20230248;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Stocks {
    TreeMap<String, Integer> productos = new TreeMap<>();
    String[][] id = {
            {"1", "50"},
            {"2", "100"},
            {"3", "100"},
            {"4", "100"},
            {"5", "100"},
    };
    public void ListadoProductos() {
        String NombreProductos;
        int cantidadStock;
        int nuevaCantidad;

        productos.put("Soda", 50);
        productos.put("Churro", 100);
        productos.put("Pan", 100);
        productos.put("Pasteles", 100);
        productos.put("Pizza", 100);

        System.out.println("Lista de Productos: " + productos);

        System.out.println("Actualizar un producto: " + productos);
    }


    public void StockBajo() {

        System.out.println("\nProductos con stock bajo (< 10 unidades):");
        boolean encontrado = false;

        for (int i = 0; i < productos.length; i++) {
            int stock = Integer.parseInt(productos[i][1]);
            if (stock < 10) {
                System.out.println("ID: " + productos[i][0] + " - Stock: " + productos[i][1]);
                encontrado = true;
            }
        }
    }
}