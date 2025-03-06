
public class FindMinimum {
    public static void main(String[] args) {
        if(args.length!=3){
            System.out.println("You should give a score!!!");
        }
        else{
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            int num3=Integer.parseInt(args[2]);

            if(num1<num2 &&num1<num3){
                System.out.println("First number is smaller.");
            }
            else if(num2<num1 && num2<num3){
                System.out.println("Second number is smaller");
            }
            else if(num3<num1 && num3<num2){
                System.out.println("Third number is smaller");
            }
            else{
                System.out.println("All numbers are equal.");
            }
        }
    }
}
