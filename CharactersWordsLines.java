package Ruslan_7kd;
import java.io.*;
import java.util.*;
public class CharactersWordsLines {
    public static void main(String[] args) throws IOException {
        //Instruction will be given from cmd
        //File name as parameters from cmd
        if(args.length == 0) {
            System.out.println("Kindly provide Parameters");
            System.exit(1);
        }
        File myfile = new File(args[0]);
        if(!(myfile.exists())){//in case file doesn't exits
            System.out.println("File doesn't exists");
            System.exit(0);
        }
        int characterCounter = 0;//character counter
        int wordCounter = 0;//word counter
        int lineCounter = 0;//Line counter
        Scanner reader = new Scanner(myfile);//File Reader
        while(reader.hasNextLine()){//Iterator
            String[] totalWords = reader.nextLine().split(" ");//Total words Array
            lineCounter ++;//increment
            wordCounter += totalWords.length;//increment
            for (int i = 0; i < totalWords.length ; i++) {
                 characterCounter += totalWords[i].trim().length();//incrementing
            }
        }
        //Displaying
        System.out.printf("Number of lines are: %d.\n",lineCounter);
        System.out.printf("Number of words are: %d.\n",wordCounter);
        System.out.printf("Number of characters are: %d.\n",characterCounter);
    }
}
