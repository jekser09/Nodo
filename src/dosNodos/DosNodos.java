/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosNodos;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Torrev_101
 */
public class DosNodos {
    public DosNodos(){   
        int valor;
        Nodo p=new Nodo();
        Scanner sc=new Scanner(System.in);
        Nodo q=new Nodo();
        System.out.println("---dato 1---");
        valor=sc.nextInt();
        p.dato=valor;        
        q=p;
        p=new Nodo();
        q.enlace=p;
        System.out.println("---dato 2---");
        valor=sc.nextInt();
        p.dato=valor;
        System.out.println("----valores----");
        System.out.println("dato 1: "+q.dato);
        System.out.println("dato 2: "+q.enlace.dato);
    }
    
}

class Nodo{
    int dato;
    Nodo enlace;    
}
