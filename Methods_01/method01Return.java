package Methods_01;

/**
 * return type method or functions
 * check code return type function code
 * this is medimum level methods
 * 
 * 1st methods class are basic function
 * 
 */
public class method01Return {
    public static int presun(int a) { // parameter means apan yala user kadun ghenar

        System.out.println("Nanda");

        if (a > 0) 
            return 5;
        else
            return 10;

    } // multi use return stetament


    // return multi type function

    public static int  max(int a, int b , int c){

        if(a >= b && a >= c) return a;
        else if(b >= a && b >= c) return b;
        else return c ;

        
        }// this is fuction check max and how to use malti functions 

    // note: nootebook made yak ex liha and note lih multi return and anhy more

    public static void main(String[] args) {
        // int x = presun(7);// prasun method is value because this is a return type funcction

        // System.out.println(3 + x); // multi return stetament use in this method and calling

 

System.out.println(max(9945,5995 , 585)); // check return method how to use in methods multi methods 








    }

}
