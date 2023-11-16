package SPEC;

public class User {
    public String Name;
    protected String Gender;
    protected String Major;
    protected String Job;
    public String Id;
    private String Pw;

    public User(String name, String gender, String major, String job, String id, String pw) {
        this.Name = name;

        this.Gender = gender;
        this.Major = major;
        this.Job = job;
        this.Id = id;
        this.Pw = pw;
    }
}
