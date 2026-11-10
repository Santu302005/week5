public class factorial {
    int calculate(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
    
}
public class testfactorial {
    public static void main(String[] args) {
        factorial f = new factorial();

        int result = f.calculate(5);

        System.out.println("Factorial = " + result);
    }
}