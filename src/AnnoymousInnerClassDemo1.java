import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnnoymousInnerClassDemo1 {
	public static void main(String[] args) {
		List<Product> list =
					Arrays.asList(new Product("볼펜",200),
							new Product("키보드",1000),
							new Product("연필",100),
							new Product("마우스",5000));
		
		Collections.sort(list,new Comparator<Product>(){
			
			@Override
			public int compare(Product front, Product back) {
				return back.price-front.price;
			}
		});
	System.out.println(list);
	}
}