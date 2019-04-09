package mvc.services.impl;

import mvc.repositories.StudentsRepository;
import mvc.entities.Student;
import mvc.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class StudentsServiceImpl implements StudentsService {

    private final StudentsRepository studentsRepository;

    @Autowired
    public StudentsServiceImpl(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Student addStudent(final Student student) {
        if (student == null)
            return null;
        return studentsRepository.addStudent(student);
    }

    @Override
    public Student getStudentById(final int studentId) {
        if (studentId < 1)
            return null;
        return studentsRepository.getStudentById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentsRepository.getAllStudents();
    }

    @Override
    public Student getStudentByPIB(final String pib) {
        if (pib == null || pib.equals("") || pib.equals(" "))
            return null;
        return studentsRepository.getStudentByPIB(pib);
    }

    @Override
    public List<Student> getAllStudentsByCourse(final int course) {
        if (course < 1 || course > 6)
            return null;
        return studentsRepository.getAllStudentsByCourse(course);
    }

    @Override
    public void saveStudent(final Student student) {
        if (student == null)
            return;
        studentsRepository.saveStudent(student);
    }
}