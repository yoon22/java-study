package syntax;

public class Loop3 {
	
	public static void main(String[]args) {
		int[] nums = new int[10];
		for(int i=0;i<nums.length;i++) {
			nums[i] = i;
		}
		for(int i =0; i<nums.length;i++) {
			int num = nums[i];
			System.out.print(num);
		}
		System.out.println();
		
		for(int num:nums) {
			System.out.print(num);
		}
}
}
