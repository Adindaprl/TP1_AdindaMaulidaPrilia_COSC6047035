public class targetValue {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        try {
            int[] hasil = twoSum(nums, target);
            System.out.println("Output: [" + hasil[0] + ", " + hasil[1] + "]");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array kosong");
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("Tidak ditemukan pasangan angka yang sesuai");
    }
}