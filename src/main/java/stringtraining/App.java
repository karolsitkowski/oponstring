package stringtraining;


import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        ReadWrite text = new ReadWrite();
        text.readFile(ReadWrite.FILE_NAME);





        String inputString = "abCdeefxxxXXXwfwfoooOOOewfwefweff4t3gfdvdv";
        char inputChar = 'X';

        int counter = howManyChar(inputChar,inputString);
        log("There is " + counter +" usage of " + inputChar + " character in string " + inputString);



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
