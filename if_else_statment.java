import java.util.Scanner;
class if_else_statment{
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         System.out.println("Welcome to our first projec in java.");
         System.out.println("What is your name ");
         String name = inp.next();
         System.out.println("Hello "+name);
         System.out.println("Enter your password! ");
         int pass = inp.nextInt();
         if(pass >= 999 && pass <= 9999){
            System.out.println("you will become sucessfull!!! ");

        
        System.out.println("which do you want to buy? ");
        System.out.println("Like This: pen(10AFG) && notebook(20AFG)");
        double Price =inp.nextDouble();
       
        
        Double total;
         if (Price == 10){
            System.out.println("How many do you want to buy? ");
            int num = inp.nextInt();
            total=num*Price;
            System.out.println("you must pay " +total);
         }else if(Price == 20){
             System.out.println("How many do you want to buy? ");
             int num = inp.nextInt();
             total=(Price*num);
             System.out.println("YOu Must pay "+total);
         }
     }else{
            System.out.println("insucessfuly");
         }
   }
}