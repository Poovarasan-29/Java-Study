public class findMaxNumber {

    public static int[] sort(int[] array) {

        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
        }
        return arr;
    }

    public static int findFirstMax(int[] nums) {
        return sort(nums)[0];
    }

    public static int findFirstMaxWithoutSort(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        return max;
    }

    public static int findSecondMaxWithoutSort(int[] nums) {
        int fmax = nums[0] > nums[1] ? nums[0] : nums[1];
        int smax = nums[0] < nums[1] ? nums[0] : nums[1];
        ;
        for (int i = 2; i < nums.length; i++) {
            if (smax < nums[i] && fmax < nums[i]) {
                smax = fmax;
                fmax = nums[i];
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }
        return smax;
    }

    public static int findSecondMax(int[] nums) {
        return sort(nums)[1];
    }

    public static int findThirdMax(int[] nums) {
        return sort(nums)[2];
    }

    public static void main(String[] args) {
        int arr[] = { 165, 2, 64, 86, 23, 43, 78, 1 };

        System.out.println(findFirstMax(arr));
        System.out.println(findSecondMax(arr));
        System.out.println(findThirdMax(arr));
        System.out.println(findFirstMaxWithoutSort(arr));
        System.out.println(findSecondMaxWithoutSort(arr));

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
