public class App {
    public static void main(String[] args) {
        printLoop(10, "Hello, world!");
        String password = passwordGenerator();
        password = enhanedPasswordWithNumbers(password);
        System.out.println(password);
        
    }

    private static String enhanedPasswordWithNumbers(String password) {
        StringBuilder passwordWithNumbers = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            passwordWithNumbers.append(password.charAt(i));
            passwordWithNumbers.append(i);
        }
        return passwordWithNumbers.toString();
    }


    private static String passwordGenerator() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            password.append((char) (Math.random() * 26 + 97));
        }
        return password.toString();
    }

    private static void printLoop(int i, String s) {
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }
}
