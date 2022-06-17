/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

import java.io.*;
import java.util.Scanner;
import dosNodos.DosNodos;
/**
 *
 * @author Torrev_101
 */
public class UnNodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        Nodo p=new Nodo();
        Scanner sc=new Scanner(System.in);
        p=new Nodo();
        System.out.println("valor");
        valor=sc.nextInt();
        p.dato=valor;
        System.out.println("dato: "+p.dato);
        System.out.println("----DOS NODOS-----");
        DosNodos nodos=new DosNodos();
    }   
    
}

class Nodo{
        int dato;
        Nodo enlace;
}
