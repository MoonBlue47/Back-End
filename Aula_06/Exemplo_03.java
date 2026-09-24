package Aula_06;

public class Exemplo_03 {

	public static void main(String[] args) {
		int[]num01 = {1,2,3,4,5,6,7,8,9,10};
		int[]num02 = {11,12,13,14,15,16,17,18,19,20};
		int[]total = new int[10];
		
		for(int i =0; i < num01.length; i++) {
			total[i]= num01[i]*num02[i];
		}
		
		 for(int i=0; i<total.length; i++) {
			 System.out.println(total[i]);
		 }
				
	}

}
