package com.mycompany.recursividad01;

public class Practica {

    //Vamos a asumir que x siempre va a ser un número entero positivo
    void imprime(int x) {
        if (x > 0) {
            System.out.printf("El número es: %d\n", x);
            imprime(x - 1);
        }
//        else
//        {
//            System.out.printf("Finalizó la ejecución\n", x);
//        }
    }

    //Vamos a asumir que n siempre va a ser un número entero positivo
    // 8!
    int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            System.out.printf("El número es: %d\n", n);
            return n * factorial(n - 1);
        }
    }

    int[] numeros = {3, 3, 4, 8, 9, 3, 1};

    //Método no recursivo
    //Vamos a asumir que los números que tenemos en el arreglo siempre van a ser enteros positivos
    void extraerNumeroMayor() {
        int mayor = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.printf("El número mayor es: %d\n", mayor);
    }

    //i = posición en el arreglo
    void extraerNumeroMayorRecursivo(int mayor, int i) {
        if (i < numeros.length) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            extraerNumeroMayorRecursivo(mayor, i + 1);
        } else {
            System.out.printf("El número mayor es: %d\n", mayor);
        }
    }

    void identificarMismoNumero(int x) {
        int igual = x;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == igual) {
                System.out.printf("El número que usted busca  es: %d\n ", igual);
            }
        }
    }

    void identificarMismoNumeroRecursivo(int buscar, int i) {
        if (i < numeros.length) {
            if (numeros[i] == buscar) {
                System.out.println("El numero que buscas es:" + buscar + "y se encuentra en la posicion" + i);

            }identificarMismoNumeroRecursivo(buscar, i++);
        }else{
            System.out.println("Final de la ejecucion");
        }

    }
}
