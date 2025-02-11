package org.example;

public class Principal {
    public static void main(String[] args) {

        Producto producto0 = new Producto("Seleccione un item");
        Producto producto1= new Producto("Plantas medicinales",10);
        Producto producto2= new Producto("Macetas",15);
        Producto producto3= new Producto("Sustrato para plantas",8);
        Producto producto4= new Producto("Herramientas de jardinería",70);
        Producto producto5= new Producto("Aceites esenciales",20);
        Producto producto6= new Producto("Bolsas de compost orgánico",5);

        DatosPrecargados.aniadeProductos(producto0);
        DatosPrecargados.aniadeProductos(producto1);
        DatosPrecargados.aniadeProductos(producto2);
        DatosPrecargados.aniadeProductos(producto3);
        DatosPrecargados.aniadeProductos(producto4);
        DatosPrecargados.aniadeProductos(producto5);
        DatosPrecargados.aniadeProductos(producto6);


        VentanaRegistroProductos ventanaRegistroProductos = new VentanaRegistroProductos();

    }
}
