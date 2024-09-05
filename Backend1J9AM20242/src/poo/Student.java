package poo;

public class Student extends User {

    // Atributo

    String studentType;




    // Métodos
    String [][] students = new String[5][5];

    @Override
    public void create() {
        super.create();

        String [] student = new String[5];
        System.out.println("Agregue el tipo estudiante");
        studentType = sc.nextLine();

        student[0] = Integer.toString(id);
        student[1] = name;
        student[2] = lastName;
        student[3] = email;
        student[4] = studentType;

        students[0] = student;

        for(int i = 0; i < student.length; i++){

            System.out.println(student[i]);
        }
     }

    @Override
    public void select() {
        super.select();
    }

    @Override
    public void select(int id) {
        super.select(id);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void delete(int id) {
        super.delete(id);
    }
}
