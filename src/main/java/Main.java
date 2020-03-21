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
        CSVObject questions = list.get(0);
        AnswerCounter ac1 = new AnswerCounter();
        ac1.q1(list);
        BarChartBuilder q1chart = new BarChartBuilder(questions.getQ1()[0], ac1.getStats());
        q1chart.createPieChart("q1chart");

//        Filter ageFilter = new Filter(list);
//        list = ageFilter.filterByAge(0);
//        AnswerCounter ac5 = new AnswerCounter();
//        ac5.q5(list);

//        PieChartBuilder q5chart = new PieChartBuilder(questions.getQ1()[0]+" w grupie "+AnswersSet.age[0]+" lat", ac5.getStats());
//        q5chart.createPieChart("q5byAge15-18");



    }
}
