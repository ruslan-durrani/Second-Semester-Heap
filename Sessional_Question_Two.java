package ruslan_7kd;
import java.util.*;
public class Sessional_Question_Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] results = findStates(100, 5, -5, 20, 10);
        System.out.println("Maximum number is: "+results[0]);
        System.out.println("Minimum number is: "+results[1]);
        System.out.println("Average is: "+results[2]);

    }
    public static int[] findStates(int... data){
        int max = data[0];
        int avg = 0;
        for (int i = 0; i < data.length; i++) {
            if (max < data[i])
                max = data[i];
        }
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) min = data[i];
        }
        int sum = 0;
        for (int i = 0; i < data.length; i++)sum += data[i];
        avg = sum / data.length;
        int[] list = {max, min , avg};
        return list;
    }
}
