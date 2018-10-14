import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HashCreator {
public static void main(String[] a) {
	String plainTextPassword = "admin";
	System.out.println("BCrypt hash for " + plainTextPassword + " is " + new BCryptPasswordEncoder().encode(plainTextPassword));
}
}
