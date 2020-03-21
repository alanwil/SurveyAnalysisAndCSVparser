import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

        AnswerCounter ac = new AnswerCounter();
        ac.q1(list);
        System.out.println(ac.getQuestion());
        System.out.println(ac.getStats());

//        Filter filter = new Filter(list);
//        List<CSVObject> filtered = filter.filterByAge(3);
//        System.out.println(filtered.size());

//        AnswerFilter af = new AnswerFilter();
//        list = af.q1Matcher(list, 1,2);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(Arrays.toString(list.get(i).getQ1()));
//        }
//        DefaultPieDataset pieDataSet = new DefaultPieDataset();
//        pieDataSet.setValue("Value 1", 20);
//        pieDataSet.setValue("Value 2", 30);
//        pieDataSet.setValue("Value 3", 50);
//
//        JFreeChart chart = ChartFactory.createPieChart("Pie chart", pieDataSet,true,true,false);
//
//        try {
//            ChartUtils.saveChartAsJPEG(new File("src\\main\\resources\\piechart.jpeg"), chart, 500, 300);
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}
