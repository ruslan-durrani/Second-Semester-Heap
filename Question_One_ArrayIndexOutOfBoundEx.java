package Ruslan_7kd;
import java.util.*;
public class Question_One_ArrayIndexOutOfBoundEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner object for inputz
        int[] integerList = getRandomIntegers(100);//caller method to get random integers
        System.out.print("Choose index from list of 100 indexes\n--> Enter an index: ");
        try{
            int index = input.nextInt();
            System.out.printf("The element at index %d is %d.",index,integerList[index]);
        }catch(InputMismatchException e){//catches exception if input other than int is given
            System.out.println("Integer is required");
        }
        catch(ArrayIndexOutOfBoundsException x){//Out of bound exception is handled here
            System.out.println("Out of bound index");
        }
    }
    //Method to return list random integers
    public static int[] getRandomIntegers(int a){
        int[] list = new int[a];
        Random random = new Random();//random class
        for (int i = 0; i < a ; i++) {
        list[i] = random.nextInt(a+1);
        }
        return list;
    }
}