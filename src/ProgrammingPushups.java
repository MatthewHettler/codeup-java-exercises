public class ProgrammingPushups {
    public static void main(String[] args){
//        System.out.println(multiply(5, 5));
//        System.out.println(toThePower(5, 5));
        System.out.println(sumOfBinaryNumbers("10", "11"));
        System.out.println(sumOfBinaryNumbers("1010", "1100"));
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

}
