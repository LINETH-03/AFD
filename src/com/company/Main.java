package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char w = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca de la cadena: ");
        int tamaño = scan.nextInt();
        int entrada []=new int[tamaño];
        System.out.println("Intruduzca la cadena");
        for (int i = 0; i < entrada.length; i++) {
            entrada[i]=scan.nextInt();

        }

        // char[] Entrada ={1,0,0,1};
        int inicio =1;
        int fin = 1;
        boolean Final = false;

        int cont = 0;

        int actual=inicio;
        while(!Final){
            if(cont>entrada.length-1){
                Final=true;

                break;
            }
            if(actual==1){

                if(entrada[cont]==1){
                    actual=1;
                }
                if (entrada[cont]==0){
                    actual=2;
                }
                cont++;
                continue;
            }
            if(actual==2){

                if(entrada[cont]==1){
                    actual=2;
                }
                if (entrada[cont]==0){
                    actual=1;
                }

                cont++;
                continue;

            }




        }
        if(actual==fin){
            System.out.println("La cadena es correcta");
        }
        else {
            System.out.println("La cadena es incorrecta");
        }



    }
}


