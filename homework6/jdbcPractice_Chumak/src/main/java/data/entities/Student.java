package data.entities;

public class Student {
    private int studentId;
    private String pib;
    private int course;

    public Student(String pib, int course) {
        this.pib = pib;
        this.course = course;
    }
    public Student(){
        this.studentId = -1;
        this.pib = "";
        this.course = -1;
    }
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }
}
