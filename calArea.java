public class calArea {
    public static void main(String[] args) {

        /* calArea object = new calArea();        
        int area= object.calculateArea(50, 26); */

        int area= calculateArea(50, 26);
        System.out.println("The area is : " + area);
    }

    //non static method
    /* int calculateArea(int widthOfRec, int heightOfRec){
        int area = heightOfRec * widthOfRec;
        return area;
    }*/

    //static method
    static int calculateArea(int widthOfRec, int heightOfRec){
            int area = heightOfRec * widthOfRec;
            return area;
    }   

}
