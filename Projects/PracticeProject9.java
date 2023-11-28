package Projects;

public class PracticeProject9 {

	public static void main(String[] args) {
		int nums[] = {6,3,0,2,8};
		
		//Initializing 2D arrays
		int nums1[][] = new int[3][4];
		System.out.println("Checking One Dimensional Array");
		//printing one value at a time using index number
		System.out.println(nums[2]);
		
		//updating array
		nums[2] = 4;
		System.out.println("After updating "+ nums[2]);
		System.out.println("Printing all Array values " );
		for(int i=0; i<4; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("Checking 2 Dimensional Arrays using random values");
		for(int m=0;m<3;m++) {
			for(int n=0;n<4;n++) {
				nums1[m][n]=(int)(Math.random() * 10);
			}
		}
		for (int m=0;m<3;m++) {
			for(int n=0;n<4;n++) {
				System.out.print(nums1[m][n] + " ");
			}
			System.out.println();
		}

	}

}
