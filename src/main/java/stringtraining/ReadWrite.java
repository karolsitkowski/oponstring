package stringtraining;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by sit0 on 11.05.17.
 */
public class ReadWrite {
    final static String FILE_NAME = "/home/sit0/IdeaProjects/oponstring/src/input.txt";
 //   final static String OUTPUT_FILE_NAME = "C:\\Temp\\output.txt";
//    final static Charset ENCODING = StandardCharsets.UTF_8;

    static String[] myStringList;
    static int c = 0;





    public void readFile(String filePath) throws IOException {

        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String textLine = bufferedReader.readLine();
        do {
            log(textLine);
            textLine = bufferedReader.readLine();

        } while(textLine != null);

        bufferedReader.close();
    }

    public static void toList(String line){


    }




    private static void log(String msg){
        System.out.println(msg);
    }
}

