public class LabelledBlock {
    public static void main(String[] args) {
        int a = 10;

        L1:
        {
            System.out.println("Labelled Block Begins");
            if(a==10){
                System.out.println("Breaking");
                break L1;
            }
        }
        System.out.println("Outside block");
    }


}
