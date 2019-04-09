package mvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "students")
@NamedQueries({
        @NamedQuery(name = Student.GET_ALL_STUDENTS, query = "SELECT student FROM Student student"),
        @NamedQuery(name = Student.GET_STUDENT_BY_PIB, query = "SELECT student FROM Student student WHERE student.pib = :pib"),
        @NamedQuery(name = Student.GET_STUDENTS_BY_COURSE, query = "SELECT student FROM Student student WHERE student.course = :course")
})
public class Student implements Serializable {

    public static final String GET_ALL_STUDENTS = "Student.GET_ALL_STUDENTS";
    public static final String GET_STUDENT_BY_PIB = "Student.GET_STUDENT_BY_PIB";
    public static final String GET_STUDENTS_BY_COURSE = "Student.GET_STUDENTS_BY_COURSE";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int studentId;

    private String pib;
    private int course;

    public Student() {

    }

    public Student(String pib, int course) {
        this.pib = pib;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() &&
                getCourse() == student.getCourse() &&
                Objects.equals(getPib(), student.getPib());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getPib(), getCourse());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", pib='" + pib + '\'' +
                ", course=" + course +
                '}';
    }
}