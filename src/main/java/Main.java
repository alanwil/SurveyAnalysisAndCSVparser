import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CSVReader reader = new CSVReader("src\\main\\resources\\results.csv");
        reader.readCSV();
        CSVParser parser = new CSVParser();
        List<CSVObject> list = new ArrayList<>();
        for (String[] entry: reader.getEntries()) {
            list.add(parser.cvsParse(entry));
        }


    }
}
