/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author vtali
 */
public class Calculadora {
 public static void main(String[] args) {
      Operaciones op = new Operaciones();
      op.leerNumeros();
      op.sumar();
      op.restar();
      op.multiplicar();
      op.division();
      op.porcentaje();
      op.mostarResusltados();
    }
}