package week5.day2;

public class LearnException {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		int[] nums= {1,2,3};
		
		try {
			
			System.out.println(nums[3]);
			//System.out.println(x/y);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			System.out.println(nums[2]);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Close the db");
		}
		System.out.println("Next line code");

	}

}
