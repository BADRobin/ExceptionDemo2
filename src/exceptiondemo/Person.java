package exceptiondemo;

import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in );
    private String firstName;
    private String lastName;
    private int age = scanner.nextInt();
    private String itOk = new String("It's OK");


    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public int getAge () {
        return age;
    }

    public int setAge () throws InvalidAgeException {
        this.age = age;


        if (age >= 1 && age <= 120) {
            System.out.println("It's Ok");
            return age;


        } else {

            throw new InvalidAgeException("");
        }


    }

}
