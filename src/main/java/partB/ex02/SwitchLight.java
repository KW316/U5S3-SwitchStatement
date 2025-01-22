package partB.ex02;

import java.util.Scanner;

public class SwitchLight {
    public static String switchLight(int x){
        String response = "";

        /* Put your code in between these comments : Top */
        switch(x){
            case 1:
                response = "Next Traffic Light is green";
                break;
            case 2:
                response = "Next Traffic Light is yellow";
                break;
            case 3:
                response = "Next Traffic Light is red";
                break;
            default:
                response = "Invalid Color";
                break;
        }

        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a color code");
        int x = keyboard.nextInt();
        System.out.println(switchLight(x));
    }
}
