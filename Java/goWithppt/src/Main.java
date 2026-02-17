//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // --- Part 1: Demonstrating the Bitwise AND (&) operator on numbers ---
        // The bitwise AND operator works on the binary representations of integers.
        System.out.println("--- Bitwise AND (&) Operator on Numbers ---");
        int a = 8;  // Binary: 0101
        int b = 9;  // Binary: 0011

        // Result: 0101 & 0011 = 0001 (which is 1 in decimal)
        int resultBitwise = a & b;
        System.out.println("a = " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        System.out.println("Result of a & b: " + resultBitwise);
        System.out.println("----------------------------------");

        System.out.println("\n--- Short-Circuiting with Logical AND (&&) ---");

        // --- Part 2: Demonstrating the Logical AND (&&) operator and short-circuiting ---
        // The logical AND operator evaluates boolean expressions.
        // If the first operand is false, the second operand is not evaluated.

        boolean operand1 = false;

        // In this case, since 'operand1' is false, the method 'isEvaluated()'
        // will NOT be called. The program output confirms this.
        if (operand1 && isEvaluated("with Logical AND (&&)")) {
            System.out.println("The 'if' block was executed.");
        } else {
            System.out.println("The 'if' block was NOT executed.");
        }

        System.out.println("\n--- No Short-Circuiting with Bitwise AND (&) ---");

        // --- Part 3: Demonstrating that Bitwise AND (&) does NOT short-circuit ---
        // The bitwise AND operator, when used with booleans, will evaluate both sides
        // of the expression, even if the first part is false.

        boolean operand3 = false;

        // Here, the method 'isEvaluated()' WILL be called, even though the
        // expression is already known to be false.
        if (operand3 & isEvaluated("with Bitwise AND (&)")) {
            System.out.println("The 'if' block was executed.");
        } else {
            System.out.println("The 'if' block was NOT executed.");
        }
    }

    /**
     * A helper method to demonstrate evaluation.
     * It prints a message to the console and returns true.
     * @param operator The name of the operator being used.
     * @return true
     */
    public static boolean isEvaluated(String operator) {
        System.out.println("--> The 'isEvaluated' method was called " + operator + ".");
        return true;
    }
}