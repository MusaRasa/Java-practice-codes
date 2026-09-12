class privates{
   private String gender = "Feamle";
  public void action(){
    System.out.println("The Roma is a "+this.gender+", But she want to her identifier become private_ ");
   }
}

public class accessModifier {
  public static void main(String[] args) {
    privates per1 = new privates();
    per1.action();
    // System.out.println();
  }  
}
