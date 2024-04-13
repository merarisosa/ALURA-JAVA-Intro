package Clase04;

import java.util.Scanner;

public class AppBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcionSeleccionada = 0;
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;


        System.out.println("*************************************************");
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println( "Tipo de cuenta: "+tipoCuenta);
        System.out.println("Saldo disponible :"+saldoDisponible+"$");
        System.out.println("*************************************************");

        while(opcionSeleccionada != 9 ){
            System.out.println("Escriba el numero de la opción deseada: ");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Salir");
            opcionSeleccionada = sc.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    System.out.println("Hola! Tu saldo actual es: "+saldoDisponible);
                    break;
                case 2:
                    System.out.println("¿Cuál es la cantidad que deseas retirar?");
                    double respuesta = sc.nextDouble();

                    if(respuesta >saldoDisponible){
                        System.out.println("Lo siento, no cuentas con el efectivo necesario para realizar esta transacción");
                    }else{
                        saldoDisponible = saldoDisponible-respuesta;
                        System.out.println("Retiraste "+respuesta);
                        System.out.println("Nuevo saldo disponible: "+saldoDisponible);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es la cantidad que deseas depositar?");
                    double resp = sc.nextDouble();
                    saldoDisponible = saldoDisponible + resp;
                    System.out.println("Depositaste: "+resp);
                    System.out.println("Tu nuevo saldo disponible es: "+saldoDisponible);
                    break;
                case 9:
                    System.out.println("Adios!");
                    break;
            }
        }
    }
}
