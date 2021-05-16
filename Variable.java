public class Variable {
    public static void main(String[] args) {
    String name = "devendra";
    System.out.println(name);
    int myNum = 12;
    System.out.println(myNum);  
    myNum = 30;
    System.out.println(myNum);
    
    final int num = 33;
    System.out.println(num);
    // num = 44; The final local variable num cannot be assigned. It must be blank and not using a compound assignment

    int x=6,y=9,z=3;
    System.out.println(x+y+z);
    }
}
