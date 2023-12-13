package mocktest;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        // Specify the path of the file you want to read
        String filePath = "";

        // Use FileReader and BufferedReader to read the file
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            // Read and print each line from the file
            System.out.println("Contents of the file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle IOException
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

