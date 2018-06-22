package exceptiondemo;

public class InvalidAgeException extends Exception {
    public String massage;
    public InvalidAgeException (String massage) {
        this.massage = massage;
        System.out.println("Age is not correct. It can not be true! Or... Is he immortal ??? !!!");
    }
    public void RuntimeException(){

    }
}
