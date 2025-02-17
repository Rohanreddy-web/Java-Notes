public class r {
    public static void main(String[] args) {
        int nums[]={0,1,1,2};
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] -nums[i - 1]==1) {
                count++;
            }
    }
    System.out.println(count);
}
}
