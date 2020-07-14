package test;

public class Ex5 {

	public static void main(String[] args) {
		int[][] scores = {{95,90,80},{80,85,90},{95,100,85},{80,95,70}};
		String[] irum = {"bank","choi","jeong","yoon"};
		int [] hap = {0,0,0,0}; // 개인별 총점
		float[] ave = {0.0f, 0.0f, 0.0f, 0.0f}; //개인별 평균
		int[] rank = {1,1,1,1}; //개인별 석차
		int[] chong = {0,0,0,0}; //과목별 총점
		float[] pyeong = {0.0f,0.0f,0.0f}; //과목별 평균
		int[]max = {0,0,0,0}; //과목별 최대값
		int[]min = {0,0,0,0}; //과목별 최소값
		int iMax=0, iMin=0, sJum=0; //최대값, 최소값, 정렬 등의 계산을 위한 임시변수
		String sName="";
		float sAve = 0.0f;
//		위 배열에서 성명, 각 과목별 점수, 개인별 점수에 대한 총점과 평균 그리고 석차를 구하여 출력하고
//		각 과목별 총점과 평균, 최대값, 최소값을 구하여 출력하되 석차순으로 오름차순 정렬하여 출력
			
		for(int i=0; i<scores.length; i++) {
			for(int k=0; k<scores[0].length; k++) {
				
				hap[i] += scores[i][k];		//개인별 총점 누적
				
				chong[k] +=scores[i][k];		//과목별 총점 누적
				
				if(scores[i][k] > max[k]) {
					max[k] = scores[i][k];
				}
				if(scores[i][k]<min[k]) {
					min[k] = scores[i][k];
				}
				
				
			}
			ave[i] = (float)hap[i]/scores[0].length;	//개인별 평균 계산
		}
		for(int i =0;i<scores[0].length;i++) {
			
			pyeong[i] = chong[i]/scores.length;	//과목별 평균계산
		}
		for(int i = 0; i<scores.length; i++) {	//개인 석차
			for(int k = 0; k<scores.length; k++) {
				if(hap[i] < hap[k]) {
					rank[i]++;
				}
			}
		}
		for(int i = 0; i<scores.length; i++) {	//오름차순 정렬
			for(int k = 0; k<scores.length; k++) {
				if(hap[i] < hap[k]) {
					sName=irum[i];	//이름 순서 변경
					irum[i]=irum[k];
					irum[k]=sName;
					for(int j=0; j<scores[0].length;j++) {		//각 과목 점수 순서 변경
						sJum = scores[i][j];
						scores[i][j] =  scores[k][j];
						scores[k][j] = sJum;
					}
					sJum = hap[i];
					hap[i] = hap[k];	//총점 변경
					hap[k] = sJum;
					
					sAve = ave[i];
					ave[i] = ave[k];	//평균순서 변경 
					ave[k] = sAve;
					
					sJum = rank[i];
					rank[i] = rank[k];	//석차 순서 변경
					rank[k] = sJum;
				}
			}
		}
		for(int i=0; i<scores.length;i++) {
			System.out.println("\t"+irum[i]);
			for(int j=0;j<scores[0].length;j++) {
				System.out.println("\t"+scores[i][j]);
			}
			System.out.print("\t"+hap[i]+"\t");
			System.out.printf("%3.2f",ave[i]);
			System.out.println();
		}
		for(int i=0; i<scores[0].length;i++) {
			System.out.println("\t"+max[i]);
		}
		for(int i=0; i<scores[0].length;i++) {
			System.out.println("\t"+min[i]);
		}
		for(int i=0; i<scores[0].length;i++) {
			System.out.println("\t"+chong[i]);
		}
		for(int i=0; i<scores[0].length;i++) {
			System.out.println("\t"+pyeong[i]);
		}
		
		
		
		
		
		
	}

}
