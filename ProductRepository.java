import java.util.*;

public class ProductRepository {

	private List<Product> plist;
	ProductRepository(){
		plist = new ArrayList<Product>();
		Product p2 = new Product(102,"T-shirt",200.00,"cloth");
		Product p3 = new Product(103,"Earphone",700.00,"electronic");
		Product p4 = new Product(104,"Oppo",9999.00,"Mobile");
		Product p5 = new Product(105,"Vivo",10000.00,"Mobile");
		Product p6 = new Product(106,"Realme",30000.00,"Mobile");
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);
	}
	public List<Product> getList(){
		return plist;
	}
}
