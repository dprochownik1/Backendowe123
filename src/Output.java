import java.io.FileOutputStream;
import java.io.*;

public class Output {
    public static void main(String[] args){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            FileOutputStream outputStream = new FileOutputStream("OutputFile.txt");
            byte[] inputArr = s.getBytes();
            outputStream.write(inputArr);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
