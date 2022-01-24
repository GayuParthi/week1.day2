package week1.day2.assignment2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int [] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrLength = array.length;
		int count;
		for(int i=0;i<arrLength-1;i++) {
			count = 0;
			for(int j=i+1;j<arrLength;j++) {
				if( array[i] == array[j]) {
					count++;
				}
				
			}
			if (count > 0)
				System.out.println(array[i]);
		}
		
	}

}
