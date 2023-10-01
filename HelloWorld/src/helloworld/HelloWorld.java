package helloworld;

//added a Scanner:
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        //first line and commit.
        System.out.println("Hello World!");
        
        //added a Scanner, second commit.
        Scanner myKB = new Scanner(System.in);

        System.out.println("Press 1 to say: Hello, humans.");
        System.out.println("or");
        System.out.println("Press 2 to say: Goodbye.");
        
        int answer = myKB.nextInt();
    }
    
}
