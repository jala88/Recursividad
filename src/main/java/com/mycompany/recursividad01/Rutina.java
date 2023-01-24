package com.mycompany.recursividad01;

public class Rutina {

    public void imprimir(int ini, int fin) {
        if (fin < 101) {
            if (fin % 2 == 0) {
                System.out.print(fin + " ");
            }
            imprimir(ini, fin + 1);
        }
    }

}
