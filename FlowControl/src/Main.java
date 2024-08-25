//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int maths = 75, physics = 99, chemistry = 80;
        int average;
        average = (maths+physics+chemistry)/ 3;

        if(average<35){
            System.out.println("Fail");
        }
        else if (average<60){
            System.out.println("Grade c");
        }
        else if(average <70){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade A");
        }
    }
}
