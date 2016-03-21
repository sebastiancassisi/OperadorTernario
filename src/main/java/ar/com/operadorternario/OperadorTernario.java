/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.operadorternario;

import java.util.Scanner;

/**
 *
 * @author ANTI
 */
public class OperadorTernario {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        //st = condicion ? verdadera : flasa
        String st = (n > 0 ? n + "El numero ingresado en mayor a 0" : n + "El numero ingresado es menor a 0");

        System.out.println(st);
    }

}
