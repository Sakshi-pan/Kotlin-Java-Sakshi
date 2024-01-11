package IOC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	@Bean
	public Engine gasEngine() {
		return new GasEngine();
	}
	@Bean
	public Car car() {
		return new Car(gasEngine());
	}
	@Bean
	public Student student() {
		return new Student();
	}
	
	@Bean
	public Teacher teacher() {
		return new Teacher();
	}
	@Bean
    public PersonService personService() {
       return new PersonServiceImp1();
	}
	@Bean
    public Address address() {
        return new Address("Cityville", "Stateville");
    }

    @Bean
    public People people(Address address) {
        return new People("John Doe", address);
    }
}
