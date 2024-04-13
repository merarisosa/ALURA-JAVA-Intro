package DesafioClase03;
/*
Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio
* entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
* En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor
* que el número generado.

Consejos:
Para generar un número aleatorio en Java: new Random().nextInt(100);
Utiliza el Scanner para obtener los datos del usuario.
Utiliza una variable para contar los intentos.
Utiliza un bucle para controlar los intentos.
Utiliza la instrucción ‘break;’ para salir del bucle.
* */

import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numeroAleatorio = new Random().nextInt(100); //asi el numero siempre sera el mismo
        int oportunidades = 0;

        while(oportunidades <5){
            System.out.println(numeroAleatorio);
            System.out.println("Adivina el número secreto que esta entre 0 y 100");
            numero = teclado.nextInt();
            oportunidades ++;

            if(numeroAleatorio == numero){
                System.out.println("Felicidades, adivinaste en "+ oportunidades + "aciertos");
            }
            else{
                System.out.println("Intenta nuevamente");
            }

            if(oportunidades == 5){
                System.out.println("Excediste el numero máximo de intentos");
            }
        }
    }
}

