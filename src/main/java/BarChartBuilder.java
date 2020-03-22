import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPosition;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
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

        CategoryPlot plot = chart.getCategoryPlot();
        CategoryAxis catAxis = plot.getDomainAxis();
        catAxis.setMaximumCategoryLabelLines(3);
        catAxis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(1.1));

        StringBuilder path = new StringBuilder("src\\main\\resources\\");
        path.append(name);
        path.append(".jpeg");
        try {
            ChartUtils.saveChartAsJPEG(new File(path.toString()), chart, 800, 700);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
