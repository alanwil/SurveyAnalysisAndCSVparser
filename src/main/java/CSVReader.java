import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private String path;
    private List<String[]> entries;

    public CSVReader(String path) {
        this.path = path;
        entries = new ArrayList<>();
    }

    public void readCSV() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(path));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split("\",\"");
            entries.add(data);
        }
        csvReader.close();
    }

    public List<String[]> getEntries() {
        return entries;
    }
}
