public class SwitchDemo {
    public static void main(String[] args) {
        int x = 2;

        switch (x) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break; // to transfer flow or else all cases will be executed
            case 3:
            case 4:
                System.out.println("Common logic for 2 cases");// Multiple case with same logic
            default:
                System.out.println("default");
        }

    }
}
