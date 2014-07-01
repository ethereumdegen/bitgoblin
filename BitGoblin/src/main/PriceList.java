package main;
import java.util.ArrayList;
import java.util.List;


public class PriceList {

	List<Float> prices = new ArrayList<Float>();

	static final int MAX_SIZE = 1000;
	
	public void add(float price){
				
		prices.add(price);
		
		if(prices.size() > MAX_SIZE){
			prices.remove(MAX_SIZE);
		}		
		
	}


	public float getLatest() {
		
		return prices.get(0);
	}
	
	
}
