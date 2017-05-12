package stringtraining;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by sit0 on 11.05.17.
 */
public class ReadWrite {
    final static String FILE_NAME = "/home/sit0/IdeaProjects/oponstring/src/input.txt";
 //   final static String OUTPUT_FILE_NAME = "C:\\Temp\\output.txt";
//    final static Charset ENCODING = StandardCharsets.UTF_8;

    ArrayList<String> myStringList = new ArrayList<>();







    public void readFile(String filePath) throws IOException {

        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String textLine;
        do {
            textLine = bufferedReader.readLine();
            myStringList.add(textLine);

            // log(textLine);

        } while(textLine != null);

        bufferedReader.close();
    }



    public String listOut(int line){
        return myStringList.get(line);
    }

    public int listSize(){
        return myStringList.size();
    }


    private static void log(String msg){
        System.out.println(msg);
    }
}

