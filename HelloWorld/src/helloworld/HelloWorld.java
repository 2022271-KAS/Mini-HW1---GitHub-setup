package helloworld;

//added a Scanner:
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        
        try{
        //first line and commit.
        System.out.println("Hello World!");
        
        //added a Scanner, second commit.
        Scanner myKB = new Scanner(System.in);

        System.out.println("Press 1 to say: Hello, humans.");
        System.out.println("or");
        System.out.println("Press 2 to say: Goodbye.");
        
        int answer = myKB.nextInt();

        //Added conditions depending on user's input, third commit.
        if(answer == 1){
            System.out.println("Hello :)");
        }
        else if (answer == 2){
            System.out.println("Goodbye :(");
        }
        else {
            System.out.println("Are you mad?!");
        }
    }
    //Added a try/catch to avoid the code from breaking. Last commit.
    }catch(Exception e){
            System.out.println("Are you extra mad?!");
        }
    
}
