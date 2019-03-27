import data.LecturesWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        worker.getLectureById(1);
        worker.getLectureById(1);
        worker.getAllLectures();
        worker.getAllLectures();
    }
}
