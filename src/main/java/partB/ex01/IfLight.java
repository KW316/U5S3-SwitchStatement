package partB.ex01;
import java.util.Scanner;
public class IfLight {
    public static String ifLight(int x ){
        String response = "";

        /* Put your code in between these comments : Top */
           if(x == 1){
               response = "Next Traffic Light is green";
           }else if( x == 2){
               response = "Next Traffic Light is yellow";
           }else if(x == 3){
               response = "Next Traffic Light is red";
           }else{
               response = "Invalid Color";
           }




        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a color code");
        int x = keyboard.nextInt();
        System.out.println(ifLight(x));
    }
}
