package org.example;


public class Producto
{
    float precio;
    int cantidad;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto(float precio, int cantidad){
        this.precio = precio;
        this.cantidad=cantidad;
    }
}
