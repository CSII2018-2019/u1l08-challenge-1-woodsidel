
public class U1L08ChallengeOne {

	public static void main(String[] args) {
		int[] arrayOne = {1,4,8,3,6,9,2,6};
		int i;
		for(i = 0; i < arrayOne.length;i++) {
			System.out.println("Control array: "+arrayOne[i]);
		}
		int movedVars = 0;
		int endVars = arrayOne.length;
		for(i = 0; i < (arrayOne.length)/2; i++) {
			endVars -= 1;
			movedVars = arrayOne[endVars];
			arrayOne[endVars]=arrayOne[i];
			arrayOne[i]=movedVars;
		}
		for(i = 0; i < arrayOne.length; i++) {
			System.out.println("Reverse array: "+arrayOne[i]);
		}
		}
		}



