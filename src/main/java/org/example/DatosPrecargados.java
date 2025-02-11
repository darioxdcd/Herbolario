package org.example;

import java.util.ArrayList;

public class DatosPrecargados {

    public static ArrayList<Producto> listaProductos = new ArrayList<>();

    public static float total;


    public static void aniadeProductos (Producto producto){
        listaProductos.add(producto);
    }
}
