package worker;

import data.dao.StudentsDAO;
import data.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {
    @Autowired
    private StudentsDAO studentsDao;

    public void saveStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }
}
