import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordAnalyzer {
    List list;

    public WordAnalyzer(List list){
        this.list=list;
    }

    public void printWords() {
        System.out.println("All Words:\n" + list);
    }

    public void printWordsReverse() {
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println("All words in Reverse Order:\n" + reversedList);
    }

    public void removePlurals() {
        List<String> copyList = new ArrayList<>(list);
        copyList.removeIf(s -> s.endsWith("s"));
        System.out.println("All Words without Plural Words:\n" +copyList);
    }
}
