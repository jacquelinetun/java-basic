public class nestedforloop {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++){
            System.out.println("For i = " + i);

            for (int j = 0; j < 2; j++){
                System.out.println("\tFor j = " + j);

                for (int k = 0; k <2; k++){
                    System.out.println("\t\tFor k = " + k);
                }
            }
        }
    }
}
