package test1;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(50);		//ar[0]=50
		ar.add(100); 	//ar[1]=100
		ar.add(150); 	//ar[2]=150
		
		Integer val1 = (Integer) ar.get(0); //boxing
		Integer val2 = (Integer) ar.get(1);
		Integer val3 = (Integer) ar.get(2);
		
		System.out.println(val1+" : "+val2+" : "+val3);
	}

}
