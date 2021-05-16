public class typeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);
        System.out.println(myDouble);


        int newint = (int) myDouble;
        System.out.println(newint);
        System.out.println(myDouble);
    }
}
