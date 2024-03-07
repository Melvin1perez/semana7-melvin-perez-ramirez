/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuadrado;

/**
 *
 * @author melvin alexander perez ramirez
 */
import java.util.Scanner;
public class Cuadrado {

    private double lado;
    private double perimetro;
    private double area;

    
    public Cuadrado() {
        this.lado = 0;
        calcularPerimetro();
        calcularArea();
    }

    
    public Cuadrado(double lado) {
        this.lado = lado;
        calcularPerimetro();
        calcularArea();
    }

    
    public Cuadrado(double lado1, double lado2) {
        this.lado = lado1;
        calcularPerimetro();
        calcularArea();
    }

    
    private void calcularPerimetro() {
        this.perimetro = 4 * this.lado;
    }

    private void calcularArea() {
        this.area = this.lado * this.lado;
    }

    
    public void mostrarResultados() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Perímetro: " + this.perimetro);
        System.out.println("Área: " + this.area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Cuadrado cuadrado1 = new Cuadrado();
        System.out.println("constructor vacío:");
        cuadrado1.mostrarResultados();

        
        System.out.print("\ndigite el valor del lado del cuadrado: ");
        double lado = scanner.nextDouble();
        Cuadrado cuadrado2 = new Cuadrado(lado);
        System.out.println("\ndogite del cuadrado creado con un lado:");
        cuadrado2.mostrarResultados();

        
        System.out.print("\ndigite el valor del primer lado del cuadrado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("digite el valor del segundo lado del cuadrado: ");
        double lado2 = scanner.nextDouble();
        Cuadrado cuadrado3 = new Cuadrado(lado1, lado2);
        System.out.println("\ncuadrado creado con dos lados:");
        cuadrado3.mostrarResultados();

        scanner.close();
    }
}
