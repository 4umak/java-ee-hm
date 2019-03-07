package data.dao;

import data.entities.Teacher;

public interface TeachersDAO {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}
