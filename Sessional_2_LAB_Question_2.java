package ruslan_7kd;

import java.util.*;

public class Sessional_2_LAB_Question_2 {
    public static void main(String[] args) {
        // Given Initialized 2D array
        String[][] arrayName = {
                {"Asad","Kamal","Zahid","Jafar","Yaqoob"},
                {"Hashim", "Waqar","Bilal","Danish","Masood"},
                {"Tahir","Ahmed","Zafar","Javed","Qasim"},
                {"Imran","Uzair","Basit","Ashraf","Rashid"}
        };
        // Method Calling
        String[][] results = myMethod(arrayName);

        // Displaying Data
        System.out.println("\n*** Sorting, (Capital and lower casing) of Rows ***\n");

        for (int i = 0; i < results.length; i++) {

            System.out.print("\nRow: "+(i));

            for (int j = 0; j < results[i].length; j++) {

                System.out.printf("\t %.8s",results[i][j]);
            }
        }
    }
    //MyMethod for sorting and casings
    public static String[][] myMethod(String[][] names){
        //Loop for sorting
        for (int i = 0; i < names.length; i++) {

            Arrays.sort(names[i]);
        }

        for (int i = 0; i < names.length; i++) {
            // If even Row the Capitalize else Lower case
            if (i % 2 == 0){

                for (int j = 0; j < names[i].length ; j++) {

                    String nameString = names[i][j];

                    names[i][j] = nameString.toUpperCase() ;// Upersae string method

                }
            }
            else

                for (int j = 0; j < names[i].length ; j++) {
                    String nameString = names[i][j];

                    names[i][j] = nameString.toLowerCase(Locale.ROOT);// Lower case string method
                }
        }
        return names;
    }
}
