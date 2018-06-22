package exceptiondemo;


public class Main {

    public static void main(String[] args) throws InvalidAgeException {

        System.out.println("Enter age: ");
        Person person = new Person();
        try {
            throw new Exception();
        } catch (Exception e) {
            person.setAge();

        }
    }
}
