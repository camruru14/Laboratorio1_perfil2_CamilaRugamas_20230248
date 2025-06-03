package CamilaRugamas_20230248;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Stocks {
    public void ListadoProductos(){
        String NombreProductos;
        int cantidadStock;
        TreeMap<String, Integer> productos = new TreeMap<>();

        productos.put("Soda",50);
        productos.put("Churro",100);
        productos.put("Pan",100);
        productos.put("Pasteles",100);
        productos.put("Pizza",100);

        System.out.println("Lista de Productos: " + productos);

        System.out.println("Actualizar un producto: " + productos);
        productos.(1, "Gaseosa", 20);

    }






}
