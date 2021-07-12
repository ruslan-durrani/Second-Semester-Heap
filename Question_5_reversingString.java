package Ruslan_7kd;
import java.util.*;
public class Question_5_reversingString {
    public static void main(String[] args) {
        //Scanner obj for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        //Caller method for recursion.
        System.out.print("Reversed string: ");
        reverseDisplay(string);
    }
    public static void reverseDisplay(String value){
        //Base Case
        if(value.length()==0){
            return ;
        }
        else{
            System.out.print(value.charAt(value.length()-1));
            //Recursive call
            reverseDisplay(value.substring(0,value.length()-1));

        }
    }
}
