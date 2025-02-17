class Solution {
    public boolean check(int[] nums) {
        int sort[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                sort[count] = nums[(j + i) % nums.length];
                count++;
            }

        }
        boolean flag = true;
        for (int i = 0; i < sort.length - 1; i++) {
            if (sort[i] > sort[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return flag;
        }
        return flag;
        Math.max()
    }
}