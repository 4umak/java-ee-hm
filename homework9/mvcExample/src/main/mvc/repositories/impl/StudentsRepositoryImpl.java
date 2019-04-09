package mvc.repositories.impl;


import mvc.entities.Student;
import mvc.repositories.StudentsRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentsRepositoryImpl implements StudentsRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Student addStudent(final Student student) {
        em.persist(student);
        return student;
    }

    @Override
    public Student getStudentById(int studentId) {
        return em.find(Student.class, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = null;
        try {
            Query query = em.createNamedQuery(Student.GET_ALL_STUDENTS, Student.class);
            students = query.getResultList();
        } catch (Exception ex) {
            System.err.println("Error in Students Repo " + ex.toString());
        }
        return students;
    }

    @Override
    public Student getStudentByPIB(String pib) {
        Student student = null;
        try {
            Query query = em.createNamedQuery(Student.GET_STUDENT_BY_PIB, Student.class);
            query.setParameter("pib", pib);
            query.setMaxResults(1);
            student = (Student) query.getResultList().get(0);
        } catch (Exception ex) {
            System.err.println("Error in Students Repo " + ex.toString());
        }
        return student;
    }

    @Override
    public List<Student> getAllStudentsByCourse(int course) {
        List<Student> students = null;
        try {
            Query query = em.createNamedQuery(Student.GET_STUDENTS_BY_COURSE, Student.class);
            query.setParameter("course", course);
            students = query.getResultList();
        } catch (Exception ex) {
            System.err.println("Error in Students Repo " + ex.toString());
        }
        return students;
    }

    @Override
    public void saveStudent(final Student student) {
        em.merge(student);
    }
}