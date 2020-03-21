import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.util.Map;

public class PieChartBuilder {
    private String question;
    private Map<String, Integer> stats;

    public PieChartBuilder(String question, Map<String, Integer> stats) {
        this.question = question;
        this.stats = stats;
    }

    public void createPieChart(String name){
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            pieDataSet.setValue(entry.getKey(), entry.getValue());
        }

        JFreeChart chart = ChartFactory.createPieChart(question, pieDataSet,true,true,false);

        StringBuilder path = new StringBuilder("src\\main\\resources\\");
        path.append(name);
        path.append(".jpeg");
        try {
            ChartUtils.saveChartAsJPEG(new File(path.toString()), chart, 500, 300);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
