/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 13-10-2022
 */
package BasicProgrammingAssessment;

public class SummativeSums {

    static int arr1[] = {1, 90, -33, -55, 67, -16, 28, -55, 15};
    static int arr2[] = {999, -60, -77, 14, 160, 301};
    static int arr3[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
        140, 150, 160, 170, 180, 190, 200, -99};

    public static int sumArray(int arr[]) {
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("1. Array Sum: " + sumArray(arr1));
        System.out.println("2. Array Sum: " + sumArray(arr2));
        System.out.println("3. Array Sum: " + sumArray(arr3));

    }

}
