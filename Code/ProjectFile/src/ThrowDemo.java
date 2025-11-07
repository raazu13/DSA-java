
    class InvalidAgeException extends Exception {
        // Constructor
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class ThrowDemo {
        // Step 2: Method that throws the user-defined exception
        static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                // Step 3: Use 'throw' keyword to manually throw the exception
                throw new InvalidAgeException("Age is below 18 — Not eligible to vote!");
            } else {
                System.out.println("Age verified. You are eligible to vote.");
            }
        }

        public static void main(String[] args) {
            try {
                System.out.println("Checking age 16:");
                checkAge(16);  // Will throw exception

                System.out.println("Checking age 20:");
                checkAge(20);  // Will not throw exception
            }
            catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            System.out.println("Program continues normally after exception handling.");
        }
    }


