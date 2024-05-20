/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion1;


public class Producto {
    
    private int codigo;
    private String descripcion;
    private double peso;

    public Producto(int codigo, String descripcion, double peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        
    }

    public Producto() {
        
        this.codigo=0;
        this.descripcion="Desconocida";
        this.peso=0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Peso: " + peso;
    }
    
    
}

