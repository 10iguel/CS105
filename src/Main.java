import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        File file = new File(input);

        PrintWriter fileText = null;
        try {
            fileText = new PrintWriter(file);
        }catch (Exception e){
            System.out.println("Nope");
        }
        fileText.println("Here is now the one");
        fileText.println("Show yourself!!!!");
        fileText.write("vamos");
        fileText.write("vamos");
        fileText.flush();
    }

}