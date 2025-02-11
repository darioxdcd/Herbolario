package org.example;


public class Producto
{
    float precio;
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public Producto(String nombre, float precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad=cantidad;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public Producto(){

    }
}
