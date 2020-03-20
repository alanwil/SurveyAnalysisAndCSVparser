public class CSVObject {
    private String dateTime;
    private String[] q1;
    private String q2;
    private String q3;
    private String q4;
    private String q5;
    private String q6;
    private String q7;
    private String q8;
    private String q9;
    private String q10;
    private String[] q11;
    private String[] q12;
    private String q13;
    private String gender;
    private String age;
    private String education;
    private String citySize;

    public CSVObject(String dateTime, String q1, String q2, String q3, String q4, String q5, String q6,
                     String q7, String q8, String q9, String q10, String q11, String q12, String q13,
                     String gender, String age, String education, String citySize) {
        this.dateTime = dateTime;
        this.q1 = q1.split(";");
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.q6 = q6;
        this.q7 = q7;
        this.q8 = q8;
        this.q9 = q9;
        this.q10 = q10;
        this.q11 = q11.split(";");
        this.q12 = q12.split(";");
        this.q13 = q13;
        this.gender = gender;
        this.age = age;
        this.education = education;
        this.citySize = citySize;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String[] getQ1() {
        return q1;
    }

    public String getQ2() {
        return q2;
    }

    public String getQ3() {
        return q3;
    }

    public String getQ4() {
        return q4;
    }

    public String getQ5() {
        return q5;
    }

    public String getQ6() {
        return q6;
    }

    public String getQ7() {
        return q7;
    }

    public String getQ8() {
        return q8;
    }

    public String getQ9() {
        return q9;
    }

    public String getQ10() {
        return q10;
    }

    public String[] getQ11() {
        return q11;
    }

    public String[] getQ12() {
        return q12;
    }

    public String getQ13() {
        return q13;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getEducation() {
        return education;
    }

    public String getCitySize() {
        return citySize;
    }


}
