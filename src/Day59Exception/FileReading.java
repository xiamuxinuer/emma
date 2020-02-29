package Day59Exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException {



        try {
            List<String>  allLines = Files.readAllLines(Paths.get("src/Day59Exception/note.txt"));
            System.out.println("allLines = " + allLines);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }




    }
}
