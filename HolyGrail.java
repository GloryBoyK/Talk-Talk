import java.util.Scanner;
/**
 * Simple IO project using Scanner
 * @version 09.22.22
 * @author 25pandey
 */ 


 public class HolyGrail{
     /**
 * Main method of class HolyGrail
 * @param args command line arguments, if needed
 */     public static void main(String[] args) {
        String name, quest;
        String color;

        System.out.println("A chat with the bridge keeper. Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        //Ask for the user's name
        Scanner s=new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name=s.nextLine();
        System.out.print("Question 2: What is your quest? ");
        quest=s.nextLine();
        System.out.print("Question 3: What is your favorite color? ");
        color=s.nextLine();
        s.close();

        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        System.out.println("Your name is "+name);
        System.out.println("Your quest is "+quest);
        System.out.println("Your favorite color is "+color);


    }
}
