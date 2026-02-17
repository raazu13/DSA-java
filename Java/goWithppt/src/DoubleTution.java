public class DoubleTution {
    public static void main(String[] args) {

        double principal= 10000;

        // we know 2p=p(1+0.07)raised to power time

        // time will be log2 divided by log(1+0.07)

        double time=Math.log(2)/Math.log(1.07);

        System.out.println(time);
    }
}
