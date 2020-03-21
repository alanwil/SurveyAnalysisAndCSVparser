import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<CSVObject> q2Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ2().equals(AnswersSet.q2[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q3Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ3().equals(AnswersSet.q3[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q4Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ4().equals(AnswersSet.q4[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q5Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ5().equals(AnswersSet.q5[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q6Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ6().equals(AnswersSet.q6[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q7Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ7().equals(AnswersSet.q7[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q8Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ8().equals(AnswersSet.q8[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q9Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ9().equals(AnswersSet.q9[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q10Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ10().equals(AnswersSet.q10[answer]))
                .collect(Collectors.toList());
    }

    public List<CSVObject> q11Matcher(List<CSVObject> list, int ... answers){
        List<CSVObject> filtered = new ArrayList<>();
        String[] answerArray = new String[answers.length];
        Arrays.sort(answers);
        for (int i = 0; i < answers.length; i++) {
            answerArray[i] = AnswersSet.q11[answers[i]];
        }
        for (CSVObject entry: list) {
            if (Arrays.asList(entry.getQ11()).containsAll(Arrays.asList(answerArray))){
                filtered.add(entry);
            }
        }
        return filtered;
    }

    public List<CSVObject> q12Matcher(List<CSVObject> list, int ... answers){
        List<CSVObject> filtered = new ArrayList<>();
        String[] answerArray = new String[answers.length];
        Arrays.sort(answers);
        for (int i = 0; i < answers.length; i++) {
            answerArray[i] = AnswersSet.q12[answers[i]];
        }
        for (CSVObject entry: list) {
            if (Arrays.asList(entry.getQ12()).containsAll(Arrays.asList(answerArray))){
                filtered.add(entry);
            }
        }
        return filtered;
    }

    public List<CSVObject> q13Matcher(List<CSVObject> list, int answer){
        return list
                .stream()
                .filter(entry -> entry.getQ13().equals(AnswersSet.q13[answer]))
                .collect(Collectors.toList());
    }


}
