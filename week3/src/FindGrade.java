public class FindGrade{

    public static void main(String[] args){

        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F
        
        int length_of_args=args.length;
        
        if(length_of_args==0){
            System.out.println("You should give a score!!1");
        }
        else{
        
        int grade1=Integer.parseInt(args[0]);
        
        if(100>=grade>=90){
            System.out.println("Note: A");
        }
        else if(90>grade>=80){
            System.out.println("Note: B");
        }
        else if(80>grade>=70){
            System.out.println("Note: C");
        }
        else if(70>grade>=60){
            System.out.println("Note: D");
        }
        else if(60>=grade>0){
            System.out.println("Note: F");
        }
        else{
            System.out.println("Invalid Grade");
        }
        }




    }



}