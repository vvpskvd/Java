public class ejercicioDOWhile {
    public static void main(String[] args) {
        var major = 0;
        do {
            if (major % 2 == 0) {
                System.out.println(major);
            }
            major++;
        } while (major <= 100);
    }
}
