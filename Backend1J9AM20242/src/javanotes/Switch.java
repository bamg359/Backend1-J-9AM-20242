package javanotes;

import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una opción: 1. Matricular Curso" +
                "2. Consultar Horarios" +
                "3. Cancelar un Curso" +
                "4. Consultar notas");

        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {
            case 1:
                System.out.println("Matriculas");
                break;
            case 2:
                System.out.println("Consultar horarios");
                break;
            case 3:
                System.out.println("Cancelar curso");
                break;
            case 4:
                System.out.println("Consultar notas");
                break;
            default:
                System.out.println("Ingrese una opcion valida");

        }







    }

}
