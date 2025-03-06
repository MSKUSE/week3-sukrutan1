
public class FindPrimes {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(2);
        for (int num = 3; num < number; num += 2) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
