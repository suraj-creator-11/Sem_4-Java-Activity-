import java.io.*;

public class FileLineNumber {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // File to read

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}