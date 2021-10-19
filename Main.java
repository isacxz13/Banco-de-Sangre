package test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int contadorPersonas = 0, hrsAyuno, dias;
        String respuesta;
        String nombre;
        System.out.println("        Banco de Sangre     ");
        System.out.println("         click Enter");
        do {
            if(contadorPersonas >= 1){
                System.out.println("\n\n\n");
            }
            consola.nextLine();
            System.out.println("      Bienvenido usuario");
            System.out.print("Nombre: ");
            nombre = consola.nextLine();
            System.out.println("    Primera Etapa (Filtro sanitario) ");
            System.out.println("Sr/a " + nombre);
            System.out.print("- Horas de ayuno >> ");
            hrsAyuno = consola.nextInt();
            System.out.print("- Dias que han pasado desde su ultima donacion\n"
                    + " Dias >> ");
            dias = consola.nextInt();
            if (hrsAyuno >= 8 && dias >= 60) {
                contadorPersonas++;
                System.out.println("    Segunda Etapa (Filtro sanitario)");
                System.out.println("\n\nMuestra No.[" + contadorPersonas + "] ");
                System.out.println("Datos del donador\n"
                        + "Nombre: " + nombre + "\nHrs de ayuno: " + hrsAyuno + "\nUltima donacion hace [" + dias + "] dias");
                System.out.println("\n\n\n    Respuesta del médico responsable");
                System.out.print("Usuario apto para donacion: ");
                respuesta = consola.next();
                if (respuesta.equals("OK")) {
                    System.out.println("El sr/a " + nombre + " es apto puede pasar a la sala de donacion");
                } else {
                    System.out.println("El donante no es apto para la donación");
                    contadorPersonas --;
                }
            } else {
                System.out.println("Etapa uno no acreditada");
            }
        } while (contadorPersonas < 5);
        System.out.println(" Sala de donaciones llena espere un momento");
    }
}
