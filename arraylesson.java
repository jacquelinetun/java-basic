public class arraylesson {
    
    public static void main(String[] args) {
        char[] demo1 = {'a', 'b', 'c', 'd', 'e'};
        int[] demo2 = {22,1,2,34};

        /*System.out.println(demo1[0]);
        System.out.println(demo1[1]);
        System.out.println(demo1[2]);
        System.out.println(demo1[3]);
        System.out.println(demo1[4]); */

        System.out.println("demo 1 length = " + demo1.length);
        System.out.println("demo 2 length = " + demo2.length);

        for (int i = 0; i < demo2.length; i = i +1){
            System.out.println(demo2[i]);
        }
    }
}
