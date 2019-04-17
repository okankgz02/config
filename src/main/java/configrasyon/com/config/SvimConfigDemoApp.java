package configrasyon.com.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SvimConfigDemoApp {

  public static void main(String[] args) {

    // read spring config java class
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(SporConfig.class);

    /*		// get the bean from spring container
    Coach theCoach = context.getBean("swimCoach", Coach.class);
    */

    // get the bean from spring container
    SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
    SwimCoach theCoach2 = context.getBean("swimCoach", SwimCoach.class);
    System.out.println(theCoach + " " + theCoach2);
    // call a method on the bean
    System.out.println(theCoach.getDailyWorkout());

    // call method to get the daily fortune
    System.out.println(theCoach.getDailyFortune());

    System.out.println("Email : " + theCoach.getEmail() + " Password: " + theCoach.getPassword());
    // close the context
    context.close();
  }
}
