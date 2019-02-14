import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        FootballTeam barca = context.getBean("barca", FootballTeam.class);
        System.out.println(barca);

        FootballTeam real = context.getBean("real", FootballTeam.class);
        System.out.println(real);
    }
}
