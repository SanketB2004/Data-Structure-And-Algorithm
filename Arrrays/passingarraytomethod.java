package Arrrays;

public class passingarraytomethod {
    
    public static void main(String[] args) {
        
        int [] x= { 10,29,14,78};

        System.out.println(x[2]);

        change(x);

        System.out.println(x[2]);

    }
    public static void change(int[]y){
y[2]=99;
    }
}

// this is only array point another variable but variable class not point varible
// only array point another array 
// lakshat thev neet imp ahe 