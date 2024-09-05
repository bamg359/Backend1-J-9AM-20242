package poo;

import java.util.Scanner;

public class User {

    //Atributos

    int id;
    String name;
    String lastName;
    int age;
    String gender;
    long phone;
    String Address;
    String email;
    String password;

    // metodos
    Scanner sc = new Scanner(System.in);

    public void create(){

        System.out.println("Ingrese el id:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre");
        name = sc.nextLine();
        System.out.println("Ingrese el apellido");
        lastName = sc.nextLine();
        System.out.println("Ingrese el Correo");
        email = sc.nextLine();
    }

    public void select(){

    }

    public void select(int id){

    }

    public void update(){

    }

    public void delete(int id){


    }
}
