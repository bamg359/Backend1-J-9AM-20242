package javanotes;

import java.util.Scanner;

public class Function {
    static Scanner sc = new Scanner(System.in);

    static double salary;
    static float cajaCompSupport;

    public static void main(String[] args) {

       salary = 2500000;
       cajaCompSupport = 0.04f;
       double value = calcularSupport(salary, cajaCompSupport);
        System.out.println(value);



    }


    public static void rangeValidator(){

        System.out.println("ingrese el salario del empleado");

        salary = sc.nextDouble();
        double legalMinSalary = 1300000;

        if(salary >= legalMinSalary && salary <= (legalMinSalary*2)){
            System.out.println("Categoria A");
        }else if(salary > (legalMinSalary*2)&& salary <= (legalMinSalary*4)){

            System.out.println("Categoria B");
        }else if (salary > (4*legalMinSalary)){

            System.out.println("Categoria C");
        }else{
            System.out.println("No Aliliado");
        }
    }



    // Funcion void

    public static void listBenefits(){

        System.out.println("Seleccion 1. Beneficios categoria A" +
                "2. Categoria B" +
                "3. Categoria C" +
                "4. No afiliados");

        int opt = sc.nextInt();

        switch (opt){
            case 1:
                System.out.println("Categoria A");
                break;
            case 2:
                System.out.println("Categoria B");
            case 3:
                System.out.println("Categoria C");
            case 4:
                System.out.println("NO afiliados");
            default:
                System.out.println("Seleccione una opcion valida");

        }

    }

    public static double calcularSupport(double salary , float cajaCompSupport){

        double supportEmployee = salary*cajaCompSupport;

        return supportEmployee;


    }



}
