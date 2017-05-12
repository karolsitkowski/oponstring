package stringtraining;


import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {

        System.out.println("Please enter letter U want search in file:");
        Scanner reader = new Scanner(System.in);
        char inputChar = reader.next().charAt(0);


        ReadWrite text = new ReadWrite();
        text.readFile(ReadWrite.FILE_NAME);


        int sumCounter=0;
        for (int i = 0; i < (text.listSize()-1); i++) {

            int counter = howManyChar(inputChar,text.listOut(i));
            log("There is " + counter +" usage of -->" + inputChar + " char in line " + (i+1));

            //    log(text.listOut(i));
            sumCounter += counter;
        }

        System.out.println("Sum of all -->" + inputChar + "'s<-- in file is: " + sumCounter);














    }

    private static void log(String msg){
        System.out.println(msg);
    }





    public static int howManyChar(char charToCount, String stringToCheck){

        int c = 0;
        for (int i=0;i<stringToCheck.length() ;i++)
            if (stringToCheck.charAt(i) == charToCount)
                c++;
        return c;

    }

}
