package chap04;

public class For06 {

	public static void main(String[] args) {
		int[] su = {60, 75, 85, 90, 80, 70, 65}; //su[7]
		int tot = 0;
		for(int i=0;i<su.length;i++) {
			if(su[i]<=0) {
				System.out.println("�ǳʶ�");
				continue;
			} else if(su[i]>=101) {
				break;
			}
			
			
			System.out.println((i+1)+"�� ���� : "+su[i]);
			tot += su[i];
		}
		
		int k=0;
		for(int arr : su ) {
//			���� ���� foreach��
			k++;
			System.out.println(k+"�� ���� : "+arr);
			tot+=arr;
		}
		System.out.println("���� : "+tot);
		System.out.println("��� : "+(double) (tot/su.length));
		
	}

}
