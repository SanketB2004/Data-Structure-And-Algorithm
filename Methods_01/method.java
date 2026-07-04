package Methods_01;

/**
 * method
 */
public class method {

   public static void sharavan(){

    karan();
    System.out.println("Khushi");
    
   }

   public static void main(String[] args) {
    
riyanshi();
   }

   public static void karan(){

    System.out.println("Yashika");
   }

   public static void riyanshi(){
    karan();;
    sharavan();
    System.out.println("Ajay");
    sharavan();
   }


}

// output : 
// yashika 
// yashika
// khushi
// ajay
// yashika
// khushi