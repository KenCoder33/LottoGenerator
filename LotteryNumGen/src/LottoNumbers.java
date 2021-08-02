import java.util.Random;
import java.util.Arrays;

public class LottoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int min = 1, max = 50, slots = 5;
		Random bonus = new Random();
		int frm = 1, top = 15, lucky = 1;
		
		// all elements are initialized to be zeros
		int[] lotteryArray = new int[slots];
		boolean isRepeated;
		int randomNumber = 0;
		
		// bonus number elements
		int[] goldArray = new int[lucky];
		boolean isRepeat;
		int luckyNumber = 0;
		
		for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++ ) {
			do { 
				isRepeated = false;
				//Numbers from 1 to 50
				randomNumber = rand.nextInt(max + 1 - min) + min;
				//check for repeated numbers
				//elements used not  less than 0 
				for (int k = 0; k <= indexDrawn; k++) {
					if (lotteryArray[k] == randomNumber) {
						isRepeated = true;
						break;
						
					}
				}
				
			}while (isRepeated);
			lotteryArray[indexDrawn] = randomNumber;
		}
		
		for (int indexDrawn = 0; indexDrawn < lucky; indexDrawn++ ) {
			do { 
				isRepeat = false;
				//Numbers from 1 to 15
				luckyNumber = bonus.nextInt(top + 1 - frm) + frm;
				//check for repeated numbers
				//elements used not  less than 0 
				for (int k = 0; k <= indexDrawn; k++) {
					if (goldArray[k] == luckyNumber) {
						isRepeat = true;
						break;
						
					}
				}
				
			}while (isRepeat);
			goldArray[indexDrawn] = luckyNumber;
		}
		
		Arrays.sort(lotteryArray);
		System.out.println("The results of the lottery:");
		for (int i = 0; i < slots; i++) {
			System.out.print(lotteryArray[i] + " ");
			
		
		}
		Arrays.sort(goldArray);
		System.out.print("Bonus:");
		for (int j = 0; j < lucky; j++) {
			System.out.print(goldArray[j] + " ");
	}

}
}
