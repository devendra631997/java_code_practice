package string;

public class add_character_to_string {

    enum fruits{
        dev,
        ram,
        bhai,
        mishtha
    }
    public static void main(String[] args) {
        char a = 'a';
        String de = "de";
        System.out.println("chracter is " + a + " string is :" + de + " concatinated string is :" +de+a);

        System.out.println("working on enum to string");
        System.out.println(fruits.dev.name());
        System.out.println(fruits.ram.toString());
        System.out.println(fruits.bhai.name());
        System.out.println(fruits.mishtha.toString());

        System.out.println("working on string to float");

        String str = "100";
        float val = Float.parseFloat(str);
        System.out.println("converted to float "+val);
    }
}
