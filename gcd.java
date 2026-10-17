public class gcd {
    
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 21;
        int gcd;

        while (num1 != num2) {
            if (num1>num2) {
                num1 = num1 - num2;            
            }else if (num2>num1){
                num2 = num2 - num1;
            }
            
        }

        gcd = num1;        

        System.out.println("GCD is "+gcd);
    }
}
