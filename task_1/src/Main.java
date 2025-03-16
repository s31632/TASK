
public class task_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 5, 6, 7};
        int[] arr3 = {7, 8, 9, 10, 11};


        System.out.println(Arrays.toString(filterEvenIndexOddValue(arr)));
        System.out.println(Arrays.toString(filterEvenIndexOddValue(arr2)));
        System.out.println(Arrays.toString(filterEvenIndexOddValue(arr3)));
    }

    public static int[] filterEvenIndexOddValue(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && i % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && i % 2 == 0) {
                result[index++] = array[i];
            }
        }

        return result;
    }
}
