public class Multi {
    int x = 5;
  public static void main(String[] args) 
  {
          Multi myObj1 = new Multi();  // Object 1
          Multi myObj2 = new Multi();  // Object 2
          myObj2.x = 25;
          System.out.println(myObj1.x);  // Outputs 5
          System.out.println(myObj2.x);  // Outputs 25
    }
}