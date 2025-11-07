public class convertingDecimalToHexaDec {
    public static void main(String[] args) {


        System.out.println(hexT0Decimal(16));

    }
    static String hexT0Decimal (int decimal){

        StringBuilder hex= new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


        while(decimal >0){
            int remainder = decimal%16;
            hex.append(hexChars[remainder]);

            decimal /= 16;
        }

        return hex.reverse().toString();
    }
}
