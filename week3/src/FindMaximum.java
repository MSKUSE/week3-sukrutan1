public class FindMaximum{
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Enter two value.");
        }
        else{
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        if(args[0]>args[1]){
            System.out.println("First number is bigger than second.");
        }
        else if(args[0]<args[1]){
            System.out.println("Second number is bigger than first.");
        }
        else{
            System.out.println("Numbers are equal.");
        }
        }
    }
}