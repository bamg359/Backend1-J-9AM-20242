package javanotes;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el salario del empleado");

        double salary = sc.nextDouble();
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
}
