public class generatingRandom {
    public static void main(String[] args){

        System.out.println(rando('a','z'));
        System.out.println(rand(1,100));
    }

    static char rando(char start, char end){

        return (char)(Math.random()*(end-start+1)+start);
    }

static int rand(int start, int end){

        return (int) (Math.random()*(end-start+1)+start);
}
}
