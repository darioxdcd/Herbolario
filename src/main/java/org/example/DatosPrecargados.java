package org.example;

import java.util.ArrayList;

public class DatosPrecargados {

    public static ArrayList<Producto> listaProductos = new ArrayList<>();

    public static float totalfinal;
    public static float operacion;
    public static float totalop1;//Total producto 1
    public static float totalop2;//Total producto 2
    public static float totalop3;//Total producto 3
    public static float totalop4;//Total producto 4
    public static float totalop5;//Total producto 5
    public static float totalop6; //Total producto 6

    public static float getTotalop6() {
        return totalop6;
    }

    public static void setTotalop6(float totalop6) {
        DatosPrecargados.totalop6 = totalop6;
    }

    public static float getTotalop1() {
        return totalop1;
    }

    public static void setTotalop1(float totalop1) {
        DatosPrecargados.totalop1 = totalop1;
    }

    public static float getTotalop2() {
        return totalop2;
    }

    public static void setTotalop2(float totalop2) {
        DatosPrecargados.totalop2 = totalop2;
    }

    public static float getTotalop3() {
        return totalop3;
    }

    public static void setTotalop3(float totalop3) {
        DatosPrecargados.totalop3 = totalop3;
    }

    public static float getTotalop4() {
        return totalop4;
    }

    public static void setTotalop4(float totalop4) {
        DatosPrecargados.totalop4 = totalop4;
    }

    public static float getTotalop5() {
        return totalop5;
    }

    public static void setTotalop5(float totalop5) {
        DatosPrecargados.totalop5 = totalop5;
    }





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
