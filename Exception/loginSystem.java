// Custom Exception Class
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

// Login Class
class LoginSystem {
    private final String validUser = "admin";
    private final String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("❌ Invalid username or password!");
        }
        System.out.println("✅ Login successful! Welcome, " + user + ".");
    }
}

// Main Class
public class loginSystem{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        LoginSystem login = new LoginSystem();
        boolean success = false;

        while (!success) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            try {
                login.validate(user, pass);
                success = true; // exit loop if login successful
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        sc.close();
        System.out.println("🔒 Login process completed.");
    }
}
