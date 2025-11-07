import java.util.Scanner;

public class Q5_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks for Biology: ");
        double biology = sc.nextDouble();
        System.out.print("Enter marks for Mathematics: ");
        double mathematics = sc.nextDouble();
        System.out.print("Enter marks for Computer: ");
        double computer = sc.nextDouble();


        double total = physics + chemistry + biology + mathematics + computer;
        double percentage = (total / 500) * 100;


        char grade;
        if (percentage >= 90) {
            grade = 'A';
        }else if(percentage >= 80){
            grade = 'B';
        }else if (percentage >= 70) {
            grade = 'C';
        }else if (percentage >= 60) {
            grade = 'D';
        }else if (percentage >= 40) {
            grade = 'E';
        }else {
            grade = 'F';
        }

        System.out.println();
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
