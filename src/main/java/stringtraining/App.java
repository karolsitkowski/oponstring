package stringtraining;


public class App 
{
    public static void main( String[] args )
    {
        String inputString = "abCdeefxxxXXXwfwfoooOOOewfwefweff4t3gfdvdv";
        char inputChar = 'X';

        int counter = howManyChar(inputChar,inputString);

        System.out.println("There is " + counter +" usage of " + inputChar + " character in string " + inputString);

    }

    public static int howManyChar(char charToCount, String stringToCheck){

        int c = 0;
        for (int i=0;i<stringToCheck.length() ;i++)
            if (stringToCheck.charAt(i) == charToCount)
                c++;
        return c;

    }
}
