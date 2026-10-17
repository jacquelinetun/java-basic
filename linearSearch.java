public class linearSearch {

    public static int linearSearchFun(int[] arr, int search_data) {

        for (int i = 0; i < 6; i++) {
            if (search_data == arr[i]) {
                return i;               
            }
        }    
        return -1;
    }
        
    
    public static void main(String[] args) {
        
        int[] arr = {1,11,3,4,13,21};
        int data = 21;

        int index = linearSearchFun (arr, data);

        if (index == -1) {
            System.out.println("Data not found");
        } else{
            System.out.println("Data found at index " + index);
        }
    }
}
