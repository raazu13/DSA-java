public class StringMethods {

        public static void main(String[] args) {
            // ---------- STRING METHODS ----------
            System.out.println("=== String Methods ===");
            String str1 = "Hello";
            String str2 = "World";
            String str3 = "   Java Programming   ";

            System.out.println("1. Length: " + str1.length());
            System.out.println("2. Concat: " + str1.concat(" " + str2));
            System.out.println("3. Uppercase: " + str1.toUpperCase());
            System.out.println("4. Lowercase: " + str2.toLowerCase());
            System.out.println("5. CharAt(1): " + str1.charAt(1));
            System.out.println("6. Substring(1,4): " + str1.substring(1, 4));
            System.out.println("7. Equals: " + str1.equals("Hello"));
            System.out.println("8. CompareTo: " + str1.compareTo(str2));
            System.out.println("9. Trim: [" + str3.trim() + "]");
            System.out.println("10. Replace: " + str2.replace('o', 'a'));


            System.out.println("\n=== StringBuilder Methods ===");
            StringBuilder sb = new StringBuilder("Java");

            System.out.println("1. Initial: " + sb);
            sb.append(" Programming");
            System.out.println("2. After append: " + sb);
            sb.insert(4, " Language");
            System.out.println("3. After insert: " + sb);
            sb.delete(4, 13);
            System.out.println("4. After delete: " + sb);
            sb.reverse();
            System.out.println("5. After reverse: " + sb);
            sb.reverse();
            sb.replace(0, 4, "C++");
            System.out.println("6. After replace: " + sb);
            System.out.println("7. Capacity: " + sb.capacity());


        }
    }


