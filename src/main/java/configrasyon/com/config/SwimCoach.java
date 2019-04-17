package configrasyon.com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Scope("session")
public class SwimCoach implements Coach {

  private FortuneService fortuneService;

  @Value("${data.email}")
  private  String email;

  @Value("${data.password}")
  private String password;

  public SwimCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Swim 1000 meters as a warm up";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }
}
