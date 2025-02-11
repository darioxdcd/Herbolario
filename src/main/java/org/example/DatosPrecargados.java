package org.example;

import java.util.ArrayList;

public class DatosPrecargados {

    public static ArrayList<Producto> listaProductos = new ArrayList<>();

    public static float totalfinal;
    public static float operacion;


    public static void aniadeProductos (Producto producto){
        listaProductos.add(producto);
    }

    public static float getTotalfinal() {
        return totalfinal;
    }

    public static void setTotalfinal(float totalfinal) {
        DatosPrecargados.totalfinal = totalfinal;
    }

    public static float getOperacion() {
        return operacion;
    }

    public static void setOperacion(float operacion) {
        DatosPrecargados.operacion = operacion;
    }
}
