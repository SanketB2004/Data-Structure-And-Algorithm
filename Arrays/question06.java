package Arrays;

public class question06 {
    // this is a minimum value in array

    public static void main(String[] args) {

        int[] arr = { 54, 89, 36, 45, 1, 78, 88, 975 };

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {

                min = arr[i];

            }

        }
        System.out.println(min);
    }
}
