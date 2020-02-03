import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        ===== 1. Array Basics =============================================================

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//        String[] person = {};
//        System.out.println(person.length);

        // created a person array
        String[] person = new String[3];
        person[0] = "Person1";
        person[1] = "Person2";
        person[2] = "Person3";

        for (int i = 0; i < person.length; i += 1) {
            System.out.println(person[i]);
        }

        //adding an element to array
        Object[] objArr = addPerson(person, "Person4");
        System.out.println(Arrays.toString(objArr));


    }

    /** * This method will add elements to an array and return the resulting array * @param arr * @param elements * @return */
    public static Object[] addPerson(Object[] arr, Object... elements){
        Object[] tempArr = new Object[arr.length+elements.length];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);

        for(int i=0; i < elements.length; i++)
            tempArr[arr.length+i] = elements[i];
        return tempArr;
    }




}
