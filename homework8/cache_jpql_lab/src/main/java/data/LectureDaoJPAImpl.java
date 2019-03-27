package data;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional

public class LectureDaoJPAImpl implements LecturesDao {
    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    public Lecture getLecture(int id) {
        return em.find(Lecture.class,id);
    }

    @Cacheable("lecturesCache")
    public Lecture getLectureById(int id) {
        Query query1 = em.createQuery(
                "select l from Lecture l " +
                        "where l.id=" + id, Lecture.class);

        return (Lecture) query1.getSingleResult();
    }

    @Cacheable("lecturesCache")
    public List<Lecture> getAllLectures() {
        return em.createNamedQuery("selectAllLectures", Lecture.class).getResultList();
    }


    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
    }
}
