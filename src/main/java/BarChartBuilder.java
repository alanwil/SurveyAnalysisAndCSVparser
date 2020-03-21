import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.util.Map;

public class BarChartBuilder {
    private String question;
    private Map<String, Integer> stats;

    public BarChartBuilder(String question, Map<String, Integer> stats) {
        this.question = question;
        this.stats = stats;
    }

    public void createPieChart(String name){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            dataSet.setValue(entry.getValue(),"%", entry.getKey());
        }

        JFreeChart chart = ChartFactory.createBarChart(question, "", "%", dataSet,
                                                    PlotOrientation.VERTICAL,false,true,false);
//        PieSectionLabelGenerator label = new StandardPieSectionLabelGenerator("{2}", new DecimalFormat("0"), new DecimalFormat("0.0%"));
//        PiePlot plot = (PiePlot) chart.getPlot();
//        plot.setLabelGenerator(label);

        StringBuilder path = new StringBuilder("src\\main\\resources\\");
        path.append(name);
        path.append(".jpeg");
        try {
            ChartUtils.saveChartAsJPEG(new File(path.toString()), chart, 800, 500);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
