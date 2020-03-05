import java.util.ArrayList;
import java.util.Arrays;

public class ProgrammingPushups {
    public static void main(String[] args){
//        System.out.println(multiply(5, 5));
//        System.out.println(toThePower(5, 5));
//        System.out.println(sumOfBinaryNumbers("10", "11"));
//        System.out.println(sumOfBinaryNumbers("1010", "1100"));

//        String[] fruits = new String[]{"banana", "kiwi", "apple", "grapefruit", "pear", "jackfruit"};
//        int length = fruits.length;
//        ArrayList<String> newFruits = new ArrayList<>();
//        for (int i = 0; i < length; i++) {
//            newFruits.add(fruits[i]);
//        }
//        System.out.println(newFruits);

//        ArrayList<String> f = new ArrayList<>();
//        String[] fruits = {"Kiwi","Apple","Grapes","Banana","Guava","Pear"};
//        for (String fruit : fruits) {
//            f.add(fruit);
//        }
//        System.out.println(f);

//        String[] lines = {
//                "This is a line\n",
//                "This is a second line\n",
//                "This is a third line\n",
//                "This is a fourth line\n",
//                "This is the fifth and final line\n"
//        };
//        ArrayList<String> l = new ArrayList<>(Arrays.asList(lines));
//        System.out.println(l);

//        System.out.println(compareNumbers(5,5));
//        System.out.println(compareNumbers(10,20));
//        System.out.println(compareNumbers(30,10));


    }

    public static int multiply (int a, int b){
        int sum = 0;
        for (int i = 0; i < b; i++ ){
            sum += a;
        }
        return sum;
    }

    public static int toThePower(int a, int b){
        int product = 1;
        for (int i = 0; i<b; i++){
            product *= a;
        }
        return product;
    }

    public static String sumOfBinaryNumbers (String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

    public static String compareNumbers(int x, int y) {
        if (x > y){
            return x + " is greater than " + y + ".";
        } else if (x < y){
            return x + " is less than " + y + ".";
        } else if (x == y) {
            return x + " is equal to " + y + ".";
        } else {
            return "Error!";
        }
    }

    // This is a method that takes in a list of Integers and an int. It parses the list to find which pairs
    // of Integers in the list when added together equals the int parameter. Return the result as a list of lists of Integers.


    // Created a method to get the factorial of a number and output it in an array list.
    private static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> products = new ArrayList<>();
        for(int i = 1; i <= n; i++)
        {
            if (n % i == 0) {
                products.add(i);
            }
        }
        return products;
    }

}
