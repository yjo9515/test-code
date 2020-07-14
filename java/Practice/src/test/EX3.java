package test;

public class EX3 {

	public static void main(String[] args) {
		int jum = 88;
		char blank = ' ';
		char pass = 'F';
		char mo = 'N';
		
		String grade ="";
		
		if(jum>=80)pass='T';
		if(jum>=90) {
			mo = 'Y';
		}else {	mo = 'N';
			
		}
		if(jum>=90) {
			grade="A";
		}else if(jum>=80) {
			
			grade="B";
		}else {
			grade="C";
		}
		
		if(jum>=90) {
			grade="A";
			if(jum>=98) {
				grade+="+";
				
			}else if (jum<94) {
				grade+="-";
			}else {
				grade+="0";
			} }
			else if(jum>=80) {
				grade="A";
				if(jum>=88) {
					grade+="+";
					
				}else if (jum<84) {
					grade+="-";
				}else {
					grade+="0";
				}
				
				
				}
			else { grade="C";}
				
			System.out.println("점수 : "+jum);
			System.out.println("합격 여부 : "+pass);
			System.out.println("장학생 여부 : "+mo);
			System.out.println("학점 : "+grade);
			
			System.out.println();
			int kor =95, eng=85, mat=75;
			String sec="";
			String data="";
			int tot=0;
			float avg=0.00f;
			float hak;
			char ff=' ';
			
			if(kor>=80 && eng>=80 && mat>=80) {
				sec="합격";
			}else {
				sec="불합격";
			}
			if(kor>=90 || eng>=90 || mat>=90) {
				data="장학생";
			}
			
			tot = kor+eng+mat;
			avg = (float) tot/3;
			if(avg>=90) {
				ff='A';
			}else if(avg>=80) {
				ff='B';
			}else if(avg>=70) {
				ff='C';
			}else if(avg>=60) {
				ff='D';
			}else {
				ff='F';
			}
			switch(ff) {
				case 'A' :	hak=4.5f;
				break;
				case 'B' :	hak=4.0f;
				break;
				case 'C' :	hak=3.5f;
				break;
				default :	hak = 3.0f;
			
			}
			System.out.println("\n");
			System.out.println("\t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
			System.out.println("\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
			System.out.println("\t당신의 학점은 "+ff+"이며, 이수학점은 "+hak+"입니다.");
			
		}
	
	
	
		
		
	}


