package Practise_oops;

// Custom checked exception for age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom checked exception for email
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class Custom_Excep {

    // Method that may throw two different exceptions
    static void registerStudent(String name, int age, String email)
            throws InvalidAgeException, InvalidEmailException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@'");
        }

        System.out.println("Student registered successfully: " + name);
    }

    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            // Try different inputs to trigger exceptions
            registerStudent("Poulami", 16, "poulami.example.com");
        } 
        catch (InvalidAgeException e) {
            System.out.println("Caught Age Exception: " + e.getMessage());
        } 
        catch (InvalidEmailException e) {
            System.out.println("Caught Email Exception: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}