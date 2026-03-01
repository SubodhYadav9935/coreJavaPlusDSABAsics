package LEETCODE;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int sum;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                sum= nums[i]+nums[j];
                if(sum==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int []{-1};

    }
    public static void main(String ...arg){
        int[] nums={2,7,11,15};
        int key =9;
        System.out.print(twoSum(nums,key));
    }

}
class TEmp{
    public static void main(String[] args) {
        int b = 3;
        if (!(b > 3)) {
            System.out.print("square ");
        }
        {
            System.out.print("circle ");
        }
        System.out.print("...");
        String s = "AMAN";
        System.out.println(s.replace('A','s'));
    }
}
class Caller {
    private void init() {
        System.out.println("Initialized");
    }

    public void start() {
        init();
        System.out.println("Started");
    }
}

 class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();     // ✅ Valid
       // c.init();      // ❌ Invalid: trying to access private method from outside
    }
}
