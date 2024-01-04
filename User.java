package MonoPackage;
//Create a Mono that represents a user authentication operation. If the authentication is successful, emit a user object; otherwise, emit an error.
import reactor.core.publisher.Mono;

public class User {
	String username;
	
	User(String username){
		this.username=username;
	}
	
	public String getUsername() {
		return username;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mono<User> authenticate=Mono.create(s->{
			boolean isAuthenticate=true;
			if(isAuthenticate) {
				s.success(new User("Sakshi"));
			}else {
				s.error(new RuntimeException("Failed"));
			}
		}
				);
		
		authenticate.subscribe(
                user -> System.out.println("Authenticated User: " + user.getUsername()),
                error -> System.err.println("Error: " + error.getMessage()),
                () -> System.out.println("Mono completed successfully")
        );

	}

}
