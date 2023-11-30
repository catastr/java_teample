package SPEC;

public class User {
    public String Name;
    public int Age;
    protected String Gender;
    protected String Major;
    protected String Job;
    public String Id;
    private String Pw;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName(String name) {
        return Name;
    }
    public void setAge(int age) {
            this.Age = age;
    }
    public int getAge() {
        return Age;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }
    public String getGender(String gender) {
        return Gender;
    }
    public void setMajor(String major) {
        this.Major = major;
    }
    public String getMajor(String gender) {
        return Major;
    }
    public void setJob(String job) {
        this.Job = job;
    }
    public String getJob(String gender) {
        return Job;
    }
    public void setId(String id) {
        this.Id = id;
    }

    public String getId(String gender) {
        return Id;
    }

    public void setPw(String pw) {
        this.Pw = pw;
    }

    public String getPw(String gender) {
        return Pw;
    }

    public User(String name, int age ,String gender, String major, String job, String id, String pw) {
        this.Name = name;
        this.Age = age;
        this.Gender = gender;
        this.Major = major;
        this.Job = job;
        this.Id = id;
        this.Pw = pw;
    }
}
