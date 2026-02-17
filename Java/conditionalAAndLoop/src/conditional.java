public class conditional {
    public static void main (String[] args){

        int Salary = 10000;
        int income = 90000;

        int a = (Salary < income) ? Salary:income; // ternary operator

        if(Salary> income){
            System.out.println("ypu are Rich");

        }else{
            System.out.println("ypu are poor");
        }

        System.out.println(a);


    }


}
