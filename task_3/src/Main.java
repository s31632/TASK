public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};

        System.out.println(Arrays.toString(rotateArray(arr1, 2)));
        System.out.println(Arrays.toString(rotateArray(arr2, 3)));
    }

    public static int[] rotateArray(int[] array, int positions) {
        int length = array.length;
        if (length == 0 || positions % length == 0) return array;

        positions = positions % length;
        int[] rotated = new int[length];


        for (int i = 0; i < length; i++) {
            rotated[(i + positions) % length] = array[i];
        }

        return rotated;
    }
}