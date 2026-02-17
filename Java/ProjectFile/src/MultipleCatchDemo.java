
    public class MultipleCatchDemo {
        public static void main(String[] args) {
            System.out.println("=== Example 1: With finally block ===");
            withFinallyExample();

            System.out.println("\n=== Example 2: Without finally block ===");
            withoutFinallyExample();
        }

        // Example with finally block
        static void withFinallyExample() {
            try {
                int a = 10, b = 0;
                int[] arr = {1, 2, 3};

                System.out.println("Result: " + (a / b)); // This will throw ArithmeticException
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException (won’t execute)
            }
            catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Caught General Exception: " + e.getMessage());
            }
            finally {
                System.out.println("Finally block executed (cleanup or closing resources).");
            }
        }

        // Example without finally block
        static void withoutFinallyExample() {
            try {
                String str = null;
                System.out.println(str.length()); // This will throw NullPointerException
            }
            catch (NullPointerException e) {
                System.out.println("Caught NullPointerException: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Caught General Exception: " + e.getMessage());
            }

            System.out.println("Program continues after try-catch without finally.");
        }
    }


