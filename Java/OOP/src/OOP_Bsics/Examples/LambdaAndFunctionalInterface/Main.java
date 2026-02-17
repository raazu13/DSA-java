//• Create a functional interface Operation with one method perform(int a, int b).
//        • Implement using:
//
//Operation add = (a, b) -> a + b;
//Operation multiply = (a, b) -> a * b;
//	• Print results.
//        🧠 Concepts: Functional interfaces, lambdas.

package OOP_Bsics.Examples.LambdaAndFunctionalInterface;

public class Main {
    public static void main(String[] args) {

        Operation add= (a,b)-> a+b;
        Operation product=(a,b)->a*b;

        Operation average=(a,b)-> {int sum=a+b; return sum/2;};

        System.out.println(add.perform(2,3));
        System.out.println(product.perform(4,5));
        System.out.println(average.perform(6,10));
    }
}
