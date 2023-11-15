public class Specifications extends User {
    private String introduction;
    private int eng_score;
    private int grade;
    private int num_career;

    // 생성자
    public Specifications(String name, String gender, String major, String job,
                          String id, String pw, String introduction, int eng_score, int grade, int career) {
        super(name, gender, major, job, id, pw);
        this.introduction = introduction;
        this.eng_score = eng_score;
        this.grade = grade;
        this.num_career = career;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getEng_score() {
        return eng_score;
    }

    public void setEng_score(int eng_score) {
        this.eng_score = eng_score;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getNum_career() {
        return num_career;
    }

    public void setNum_career(int num_career) {
        this.num_career = num_career;
    }
}
