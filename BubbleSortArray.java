public class BubbleSortArray {
    public static void bubbleSort (int[] arrayA){

        //pass
        for ( int i = 0; i < arrayA.length; i++) {

            //swap loop
            for ( int j = 0; j < arrayA.length - i - 1; j++){

                //swap
                if (arrayA[j] > arrayA[j+1]) {
                    //make swap
                    int temp = arrayA[j];
                    arrayA[j] = arrayA[j+1];

                    arrayA[j+1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int [] arrayA = {28,84,73,16,51};

        bubbleSort(arrayA);

        for(int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");

        }
    }
}
