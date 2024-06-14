public class Main {
    // Rusak method
    static int total = 0;
    public static void rusak(int n){
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
            total++;
        }

        rusak((int) n/2);
    }

    // roger method
    public static int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k,--b);
        else return 0 + roger(k,--b);
    }

    // countUppercaseLowercaseNumberSymbols method
    public static void countUppercaseLowercaseNumberSymbols(String text) {
        int uppercase = 0;
        int lowercase = 0;
        int number = 0;
        int symbols = 0;

        for (char ch : text.toCharArray()) {
            switch (Character.getType(ch)) {
                case Character.UPPERCASE_LETTER:
                    uppercase++;
                    break;
                case Character.LOWERCASE_LETTER:
                    lowercase++;
                    break;
                case Character.DECIMAL_DIGIT_NUMBER:
                    number++;
                    break;
                default:
                    symbols++;
                    break;
            }
        }

        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Number: " + number);
        System.out.println("Symbols: " + symbols);
    }

    public static void main(String[] args) {
        System.out.println("=".repeat(10) + " Soal 1 " + "=".repeat(10));
        rusak(1000); // Rusak method
        System.out.println("Total Hello: " + total);

        System.out.println();
        System.out.println("=".repeat(10) + " Soal 2 " + "=".repeat(10));
        System.out.println(roger(8, 8)); // Roger method

        System.out.println();
        System.out.println("=".repeat(10) + " Soal 3 " + "=".repeat(10));
        countUppercaseLowercaseNumberSymbols("pemrogramanDasarJava1"); // countUppercaseLowercaseNumberSymbols method
    }
}