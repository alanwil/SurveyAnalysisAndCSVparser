import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnswerCounter {
    private String question;
    private Map<String, Integer> stats;

    public AnswerCounter() {
        question = "";
        stats = new HashMap<>();
    }

    public void q1(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ1()[0];
        int[] stats = new int[AnswersSet.q1.length];
        for (CSVObject entry : listToProcess) {
            for (String answer : entry.getQ1()) {
                if (answer.equals(AnswersSet.q1[0])) ++stats[0];
                if (answer.equals(AnswersSet.q1[1])) ++stats[1];
                if (answer.equals(AnswersSet.q1[2])) ++stats[2];
                if (answer.equals(AnswersSet.q1[3])) ++stats[3];
                if (answer.equals(AnswersSet.q1[4])) ++stats[4];
                if (answer.equals(AnswersSet.q1[5])) ++stats[5];
                if (answer.equals(AnswersSet.q1[6])) ++stats[6];
                if (answer.equals(AnswersSet.q1[7])) ++stats[7];
                if (answer.startsWith(AnswersSet.q1[8])) ++stats[8];
            }
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q1[i], stats[i]);
        }
    }

    public void q2(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ2();
        int[] stats = new int[AnswersSet.q2.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ2().equals(AnswersSet.q2[0])) ++stats[0];
            if (entry.getQ2().equals(AnswersSet.q2[1])) ++stats[1];
            if (entry.getQ2().equals(AnswersSet.q2[2])) ++stats[2];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q2[i], stats[i]);
        }
    }

    public void q3(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ3();
        int[] stats = new int[AnswersSet.q3.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ3().equals(AnswersSet.q3[0])) ++stats[0];
            if (entry.getQ3().equals(AnswersSet.q3[1])) ++stats[1];
            if (entry.getQ3().equals(AnswersSet.q3[2])) ++stats[2];
            if (entry.getQ3().equals(AnswersSet.q3[3])) ++stats[3];
            if (entry.getQ3().equals(AnswersSet.q3[4])) ++stats[4];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q3[i], stats[i]);
        }
    }

    public void q4(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ4();
        int[] stats = new int[AnswersSet.q4.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ4().equals(AnswersSet.q4[0])) ++stats[0];
            if (entry.getQ4().equals(AnswersSet.q4[1])) ++stats[1];
            if (entry.getQ4().equals(AnswersSet.q4[2])) ++stats[2];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q4[i], stats[i]);
        }
    }

    public void q5(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ5();
        int[] stats = new int[AnswersSet.q5.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ5().equals(AnswersSet.q5[0])) ++stats[0];
            if (entry.getQ5().equals(AnswersSet.q5[1])) ++stats[1];
            if (entry.getQ5().equals(AnswersSet.q5[2])) ++stats[2];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q5[i], stats[i]);
        }
    }

    public void q6(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ6();
        int[] stats = new int[AnswersSet.q6.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ6().equals(AnswersSet.q6[0])) ++stats[0];
            if (entry.getQ6().equals(AnswersSet.q6[1])) ++stats[1];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q6[i], stats[i]);
        }
    }

    public void q7(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ7();
        int[] stats = new int[AnswersSet.q7.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ7().equals(AnswersSet.q7[0])) ++stats[0];
            if (entry.getQ7().equals(AnswersSet.q7[1])) ++stats[1];
            if (entry.getQ7().equals(AnswersSet.q7[2])) ++stats[2];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q7[i], stats[i]);
        }
    }

    public void q8(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ8();
        int[] stats = new int[AnswersSet.q8.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ8().equals(AnswersSet.q8[0])) ++stats[0];
            if (entry.getQ8().equals(AnswersSet.q8[1])) ++stats[1];
            if (entry.getQ8().equals(AnswersSet.q8[2])) ++stats[2];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q8[i], stats[i]);
        }
    }

    public void q9(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ9();
        int[] stats = new int[AnswersSet.q9.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ9().equals(AnswersSet.q9[0])) ++stats[0];
            if (entry.getQ9().equals(AnswersSet.q9[1])) ++stats[1];
            if (entry.getQ9().equals(AnswersSet.q9[2])) ++stats[2];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q9[i], stats[i]);
        }
    }

    public void q10(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ10();
        int[] stats = new int[AnswersSet.q10.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ10().equals(AnswersSet.q10[0])) ++stats[0];
            if (entry.getQ10().equals(AnswersSet.q10[1])) ++stats[1];
            if (entry.getQ10().equals(AnswersSet.q10[2])) ++stats[2];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q10[i], stats[i]);
        }
    }

    public void q11(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ11()[0];
        int[] stats = new int[AnswersSet.q11.length];
        for (CSVObject entry : listToProcess) {
            for (String answer : entry.getQ11()) {
                if (answer.equals(AnswersSet.q11[0])) ++stats[0];
                if (answer.equals(AnswersSet.q11[1])) ++stats[1];
                if (answer.equals(AnswersSet.q11[2])) ++stats[2];
                if (answer.equals(AnswersSet.q11[3])) ++stats[3];
                if (answer.startsWith(AnswersSet.q11[4])) ++stats[4];
            }
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q11[i], stats[i]);
        }
    }

    public void q12(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ12()[0];
        int[] stats = new int[AnswersSet.q12.length];
        for (CSVObject entry : listToProcess) {
            for (String answer : entry.getQ12()) {
                if (answer.equals(AnswersSet.q12[0])) ++stats[0];
                if (answer.equals(AnswersSet.q12[1])) ++stats[1];
                if (answer.equals(AnswersSet.q12[2])) ++stats[2];
                if (answer.equals(AnswersSet.q12[3])) ++stats[3];
                if (answer.startsWith(AnswersSet.q12[4])) ++stats[4];
            }
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q12[i], stats[i]);
        }
    }

    public void q13(List<CSVObject> listToProcess) {
        question = listToProcess.get(0).getQ13();
        int[] stats = new int[AnswersSet.q13.length];
        for (CSVObject entry : listToProcess) {
            if (entry.getQ10().equals(AnswersSet.q13[0])) ++stats[0];
            if (entry.getQ10().equals(AnswersSet.q13[1])) ++stats[1];
            if (entry.getQ10().equals(AnswersSet.q13[2])) ++stats[2];
        }
        for (int i = 0; i < stats.length; i++) {
            stats[i] = stats[i] * 100 / (listToProcess.size() - 1);
            this.stats.put(AnswersSet.q13[i], stats[i]);
        }
    }

    public String getQuestion() {
        return question;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }
}
