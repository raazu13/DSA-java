//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
            Demo d = new Demo();
        System.out.println(d.a);

        Demo motka =d;

        d.a=0;
        System.out.println(motka.a);


        int a=10;
        int tv = a;

        a=20;

        System.out.println(tv);



        }
    }
