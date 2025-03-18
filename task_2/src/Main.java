public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {3, 3, 3, 2, 2};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {7, 7, 7, 7, 2, 3};

        System.out.println(Arrays.toString(arr1) + " → Dominant: " + findDominant(arr1));
        System.out.println(Arrays.toString(arr2) + " → Dominant: " + findDominant(arr2));
        System.out.println(Arrays.toString(arr3) + " → Dominant: " + findDominant(arr3));
    }

    public static int findDominant(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int threshold = array.length / 2;

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
             if (countMap.get(num) > threshold) {
                return num;
            }
        }

        return -1;
    }
}