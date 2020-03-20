import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnswerFilter {

    public List<CSVObject> q1Matcher(List<CSVObject> list, int ... answers){
        List<CSVObject> filtered = new ArrayList<>();
        String[] answerArray = new String[answers.length];
        Arrays.sort(answers);
        for (int i = 0; i < answers.length; i++) {
            answerArray[i] = AnswersSet.q1[answers[i]];
        }
        for (CSVObject entry: list) {
            if (Arrays.asList(entry.getQ1()).containsAll(Arrays.asList(answerArray))){
                filtered.add(entry);
            }
        }
        return filtered;
    }
}
