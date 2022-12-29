import java.net.*;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        String textUrl  = "https://academic.udayton.edu/kissock/http/Weather/gsod95-current/AKANCHOR.txt";

        handleUrlContents(textUrl);
        TemperatureNormalizer obj = new TemperatureNormalizer(readFile());
        System.out.println(obj.getAdjustedAverage());
    }

    private static void handleUrlContents(String textUrl) throws IOException {
        FileWriter writer = new FileWriter("AnchorageTemperature.txt");
        URL url = new URL(textUrl);
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line;

        while ((line = bufferedReader.readLine()) != null)
            writer.write(line + "\n");

        bufferedReader.close();
        writer.close();
    }

    public static double[] readFile() throws FileNotFoundException {
        List<Double> arrList = new ArrayList<>();
        File myObj = new File("AnchorageTemperature.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String[] data = myReader.nextLine().trim().split("\\s+");
            if (Objects.equals(data[2], "1995"))
                if (Objects.equals(data[0], "1") || Objects.equals(data[0], "2"))
                    arrList.add((Double.parseDouble(data[3])));
        }
        myReader.close();
        Double[] arr = arrList.toArray(new Double[arrList.size()]);
        double[] doubleArr = Stream.of(arr).mapToDouble(Double::doubleValue).toArray();
        return doubleArr;
    }
}