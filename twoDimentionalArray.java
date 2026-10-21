public class twoDimentionalArray {
    
    public static void main(String[] args) {        
    /*   char[] demo1 = {'a', 'b', 'c', 'd', 'e'};
        int[] demo2 = {22,1,2,34};
        Object[] big_demo = {demo1, demo2};
        System.out.println( ((char[])big_demo[0]) [2]); */

        /* int[][] big = {
                        {1,2,3} ,
                        {4,5,6}
                    };
        System.out.println(big[0][2]); */

        int[] demo1 = {1,2,3};
        int[] demo2 = {4,5,6};
        int[][] big_demo = {demo1, demo2};
        System.out.println(big_demo[0][0]);

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column <2; column++) {
                System.out.println("row = " + row);
                System.out.println("column = " + column);
            }
        }
    }
}
