package chap13;

public class Util2 {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean	valueCompare = p1.getKey().equals(p2.getKey());
		return keyCompare && valueCompare;
		
	}

}
