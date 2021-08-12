/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Dell Ga
 */
public class Vehiculo {
    private String modelo,kilometraje,nruedas,velocidadmax;
    private String nombre, color, marca, tipo, placas;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getNruedas() {
        return nruedas;
    }

    public void setNruedas(String nruedas) {
        this.nruedas = nruedas;
    }

    public String getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(String velocidadmax) {
        this.velocidadmax = velocidadmax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
    
    public void agregar(){
       System.out.println("Tipo: " + this.getTipo());
       System.out.println("Marca: " + this.getMarca());
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Placas: " + this.getPlacas());
       System.out.println("Kilometraje: " + this.getKilometraje());
       System.out.println("Numero de Ruedas: " + getNruedas());
       System.out.println("Velocidad Maxima: " + this.getVelocidadmax());
       System.out.println("Color: " + this.getColor());
       System.out.println("Nombre: " + this.getNombre());
    }
    
}
