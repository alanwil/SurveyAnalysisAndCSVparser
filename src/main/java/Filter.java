import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private List<CSVObject> listToProcess;

    public Filter(List<CSVObject> listToProcess) {
        this.listToProcess = listToProcess;
    }

    public List<CSVObject> filterByAge(int answer){
        return listToProcess.stream().filter(entry -> entry.getAge().equals(AnswersSet.age[answer])).collect(Collectors.toList());
    }

    public List<CSVObject> filterByEducation(int answer){
        return listToProcess.stream().filter(entry -> entry.getEducation().equals(AnswersSet.education[answer])).collect(Collectors.toList());
    }

    public List<CSVObject> filterByCity(int answer){
        return listToProcess.stream().filter(entry -> entry.getCitySize().equals(AnswersSet.citySize[answer])).collect(Collectors.toList());
    }

    public List<CSVObject> filterByGender(int answer){
        return listToProcess.stream().filter(entry -> entry.getGender().equals(AnswersSet.gender[answer])).collect(Collectors.toList());
    }


}
