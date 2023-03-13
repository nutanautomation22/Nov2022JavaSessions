package JavaSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
//		for(int k=0; k<=i.length-1; k++) {
//			System.out.println(i[k]);
//		}
//		
	System.out.println(Arrays.toString(i));
	for(int e : i) {
		System.out.println(e);
		if(e ==20) {
			System.out.println("bye");
			break;
		}
	}
		
		
		
	}

}
