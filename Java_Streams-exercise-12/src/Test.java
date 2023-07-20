import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String pathFile =
                "C:\\Users\\salva\\Desktop\\ESERCIZI-JAVA\\ESERCIZI-JAVA-OOP-ADVANCED-V2" +
                        "\\Java_Streams-exercise-12\\src\\file.txt";
        try {
            Stream<String> leggiFile = Files.lines(Paths.get(pathFile));
            leggiFile.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}