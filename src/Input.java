
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws FileNotFoundException{
        try{
            FileInputStream inputStream = new FileInputStream("OutputFile.txt");
            Scanner scanner = new Scanner(inputStream);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
