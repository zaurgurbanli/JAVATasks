import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path filePath = new File("words.txt").toPath();
        List<String> stringList = Files.readAllLines(filePath);
        stringList.removeIf(String::isEmpty);

        WordAnalyzer list = new WordAnalyzer(stringList);
        list.printWords();
        list.printWordsReverse();
        list.removePlurals();

    }
}