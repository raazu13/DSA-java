/**
 * This program demonstrates the default values of all primitive numeric
 * types when they are declared as class fields (instance variables).
 * In Java, class fields are automatically initialized to a default value
 * if not explicitly assigned a value by the programmer.
 */
public class Main {

    // Primitive numeric types declared as class fields.
    // Their default values are automatically assigned.
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar; // Included as it's a numeric type in memory

    public static void main(String[] args) {
        // Create an instance of the class to access the fields
        DefaultValues defaults = new DefaultValues();

        System.out.println("--- Default Values of Primitive Numeric Types ---");
        System.out.println("The default value for byte is: " + defaults.defaultByte);
        System.out.println("The default value for short is: " + defaults.defaultShort);
        System.out.println("The default value for int is: " + defaults.defaultInt);
        System.out.println("The default value for long is: " + defaults.defaultLong);
        System.out.println("The default value for float is: " + defaults.defaultFloat);
        System.out.println("The default value for double is: " + defaults.defaultDouble);
        // Default char is a null character, which prints as an empty space or special character
        System.out.println("The default value for char is: '" + defaults.defaultChar + "' (represented as an empty space or control character)");
    }
}
