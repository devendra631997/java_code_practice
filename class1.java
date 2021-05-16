public class class1 {
    int x = 4;
    int y;
    int z;
    public class1(int value) {   // Create a class constructor for the class1 class
         y = 5;
         z=value;
      }
    static void method(){
        System.out.println("method from Main class");
    }
    public static void main(String[] args) {
        class1 obj = new class1(1);
        System.out.println(obj.x);
        obj.x = 8;
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.method();
        method();
        System.out.println(obj.z);
    }
}
