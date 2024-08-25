public class test {
    public static void main(String[] args) {
        int input = 150;

        for (int i = 1; i < input; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i > 100) {
                break;
            }
            System.out.println(i);
        }

        int i = 1;
        while (i < input) {
            if (i % 10 == 0) {
                i++;
                continue;
            }
            if (i >= 100) {
                break;
            }
            System.out.println(i++);
        }

        i = 1;
        do {
            if (i % 10 == 0) {
                i++;
                continue;
            }
            if (i >= 100) {
                break;
            }
            System.out.println(i++);

        } while (i < input);
    }
}

