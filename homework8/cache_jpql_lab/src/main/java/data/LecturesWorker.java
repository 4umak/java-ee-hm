package data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LecturesWorker {
    LecturesDao lecturesDao;
    @Autowired
    public LecturesWorker(final LecturesDao lecturesDao) {
        this.lecturesDao = lecturesDao;
    }

    public List<Lecture> getAllLectures() {
        return lecturesDao.getAllLectures();
    }

    public Lecture getLectureById(int id) {
        return lecturesDao.getLectureById(id);
    }
    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}
