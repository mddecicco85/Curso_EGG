/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_12_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int i,j,k;
        String iS,jS,kS;
        for (i = 0; i <= 9; i++) {
            //System.out.print(i + "-");
            for (j = 0; j <= 9; j++) {
                //System.out.print(j + "-");
                for (k = 0; k <= 9; k++) {
                    if (i != 3 && j != 3 && k != 3) {
                        System.out.println(i + "-" + j + "-" + k);
                    } else if (i == 3) {
                        iS = String.valueOf(i);  //No hace falta convertir
                        iS="E";  //No hace falta, podria escribir directamente la E
                        System.out.println(iS + "-" + j + "-" + k);  //Puedo poner E-j-k directamente
                    } else if (j == 3) {
                        jS = String.valueOf(j);
                        jS= "E";
                        System.out.println(i + "-" + jS + "-" + k);
                    } else if (k == 3) {
                        kS = String.valueOf(k);
                        kS="E";
                        System.out.println(i + "-" + j + "-" + kS);
                    }
                }
            }
        }
    }
    
}
