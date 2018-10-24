import javax.swing.JOptionPane;
public class U1L08ChallengeOne {

	public static void main(String[] args) {
		int[] array1 = {1,4,8,3,6,9,2,6};
		int subtract = 1;
		int i = 0;
		int j;
		int endVars = array1[i];
		int movedVars = array1[array1.length-subtract];
		for(i = 0; i < array1.length; i++) {
			array1[array1.length-1]=endVars;
			array1[i]=movedVars;
			i++;
			endVars = array1[i];
			subtract++;
			movedVars = array1[array1.length-subtract];
		}
		for(j = 0; j < array1[array1.length]; j++) {
			System.out.println(array1[j]);
			j++;
		}
		}
		}



