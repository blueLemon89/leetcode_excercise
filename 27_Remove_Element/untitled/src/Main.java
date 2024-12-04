

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        Main test = new Main();
        System.out.println(test.removeElement(nums, val));
//        test.removeElement(nums, val);

    }
    public int removeElement(int[] nums, int val){
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}