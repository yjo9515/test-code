package chap06;

public class ShopService {
	private ShopService () { }
	private static ShopService obj = new ShopService();
	static ShopService getInstance() {
		return obj;
	}
}