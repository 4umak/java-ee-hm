package data;

import java.util.List;

public interface LecturesDao {
    Lecture addLecture(Lecture lecture);
    Lecture getLecture(int id);
    Lecture getLectureById(int id);
    void saveLecture(Lecture lecture);
    List<Lecture> getAllLectures();

}
