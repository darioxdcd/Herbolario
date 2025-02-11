package org.example;

public class Principal {
    public static void main(String[] args) {

        Producto producto0 = new Producto("Seleccione un item");
        Producto producto1= new Producto("Infusiones",10);
        Producto producto2= new Producto("Aceite esenciales",15);
        Producto producto3= new Producto("Jabones artesanales",8);
        Producto producto4= new Producto("Cremas y ungüentos naturales",70);
        Producto producto5= new Producto("Complementos alimenticios",20);
        Producto producto6= new Producto("Miel natural",5);

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
