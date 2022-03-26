
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) throws FileNotFoundException{
        try{
            FileInputStream inputStream = new FileInputStream("OutputFile.txt");
            Scanner scanner = new Scanner(inputStream);
            String[] lines = new String[2];
            for (int i = 0; i < 2; i++){
                lines[i] = scanner.next();
                System.out.println(i + 1 + " " + lines[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
