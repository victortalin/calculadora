/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author vtali
 */
import javax.swing.JOptionPane;
public class Operaciones {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int porcentaje;
    
    //Metodos
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("coloca el núm 1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("coloca el núm 2"));       
    }
    //Metodo de suma
    public void sumar(){
        suma=numero1+numero2;
    }
    
    //Metodo de resta
    public void restar(){
        resta=numero1-numero2;
    }
    
    //metodo de multoplicacion
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    
    //Metodo de resta
    public void division(){
        division=numero1/numero2;
    }    
    
    //metodo porcentaje
    public void porcentaje (){
        porcentaje=(numero1/numero2) * 100;        
    }
    
    //Muestra resultados    

      public void mostarResusltados(){
          System.out.print("La suma es: " + suma);
          
          System.out.print("La resta es: " + resta);
          
          System.out.print("La multiplicacion es: " + multiplicacion);
          
          System.out.print("La division es: " + division);
          
          System.out.print("El porcentaje es: " + porcentaje);
      }
}
