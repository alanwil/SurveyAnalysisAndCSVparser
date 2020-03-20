import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
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

        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        pieDataSet.setValue("Value 1", 20);
        pieDataSet.setValue("Value 2", 30);
        pieDataSet.setValue("Value 3", 50);

        JFreeChart chart = ChartFactory.createPieChart("Pie chart", pieDataSet,true,true,false);

        try {
            ChartUtils.saveChartAsJPEG(new File("src\\main\\resources\\piechart.jpeg"), chart, 500, 300);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
