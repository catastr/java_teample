package SPEC;

public class Spec_Calculator extends Specifications {
    // 추가된 멤버 변수
    private int cut_eng;
    private double cut_grade;
    private int cut_career;

    // 생성자
    public Spec_Calculator(String name, int age, String gender, String major, String job,
                           String id, String pw, String introduction,int eng_score, int grade, int num_career) {
        super(name, age,gender, major, job, id, pw, introduction, eng_score, grade, num_career);
        this.cut_eng = cut_eng;
        this.cut_grade = cut_grade;
        this.cut_career = cut_career;
    }

    // 비교 및 출력 메소드
    public void compareAndPrint() {
        boolean pass = true;
        int cnt = 0;

        if (getEng_score() < cut_eng) {
            System.out.println("영어 성적이 부족합니다. 현재 점수 : " + getEng_score() + " (부족한 점수 : " + (cut_eng - getEng_score()) + ")");
            pass = false;
            cnt++;
        }

        if (getGrade() < cut_grade) {
            System.out.println("졸업 성적이 부족합니다. 현재 점수 : " + getGrade() + " (부족한 점수 : " + (cut_grade - getGrade()) + ")");
            pass = false;
            cnt++;
        }

        if (getNum_career() < cut_career) {
            System.out.println("경력이 부족합니다. 현재 경력 수: " + getNum_career() + " (부족한 경력 수: " + (cut_career - getNum_career()) + ")");
            pass = false;
            cnt++;
        }

        if (pass) {
            System.out.println("합격 가능");
        }
    }

    // 기타 필요한 메서드 추가 가능
}
