package test;

public class Ex6 {

	public static void main(String[] args) {
		int[][] jum = {{100,90,80},{95, 85, 80}, {95,100,85}};
		String[] name = {"kim","lee","park"};
		int[] tot = {0,0,0};
		float[] avg = {0.0f,0.0f,0.0f};
		char[] hak = {' ', ' ', ' '};
		
		for(int i=0; i<name.length; i++) {
			System.out.println();
			for(int k=0; k<jum.length; k++) {
				
				 tot[i]+=jum[i][k];
				 System.out.println(jum[i][k]+"\t");
			}
			avg[i] = (float) tot[i]/3;
			if(avg[i]>=90) {
				hak[i] = 'A';
			}else if(avg[i]>=80) {
				hak[i] = 'B';
			}else {
				hak[i] = 'C';
			}
			System.out.println(tot[i]+"\t");
			System.out.printf("%3.2f", avg[i]);
			System.out.print("\t"+hak[i]+"\t");
		}

	}

}
