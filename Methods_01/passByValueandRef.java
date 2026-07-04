package Methods_01;

public class passByValueandRef {
    
    public static void change(int x){
        x = 10;
    }

    public static void main(String[] args) {
        
        int x = 6;
        System.out.println(x);

        change(x);

        System.out.println(x);
    }
} 
// nit samjun ghe 
