package Ruslan_7kd;
import java.util.*;
import java.io.*;
public class MyProgram {
    public static void main(String[] args) throws IOException {
        //input should be
        //java MyProgram Javed filename
        if(args.length == 0){//in case no argument is passed
            System.out.println("Kindly pass an arguments");
            System.exit(0);
        }
        File file = new File(args[1]);
        if(!(file.exists())){//in case file doesn't exists
            System.out.println("File doesn't exists");
            System.exit(1);
        }
        String removedText = "";
        Scanner sc = new Scanner(file);//Reader object
        boolean x = false;
        while(sc.hasNextLine()){//iterator
            String line = sc.nextLine();
            if(line.contains(args[0])){
                //replaceAll method to replace text
                removedText += line.replaceAll( args[0],"")+"\n";
                x = true;
            }
            else removedText += line+"\n";
        }
        FileWriter writer = new FileWriter(file);
        writer.write(removedText);
        writer.close();
        if(x) System.out.printf("Action has been perform\nThe text %s has been removed",args[0]);
        else System.out.println("No such word found.\nTry other word");
    }
}
