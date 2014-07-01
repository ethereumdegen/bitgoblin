package main;
import com.eclipsesource.json.JsonObject;


public class Worker extends Thread {

	public Worker()
	{
		
		
		
	}
	
	
	public void run()
	{
		
		while(true)
		{
			
			
			
			try {
				update();
				
				Thread.sleep(60*1000);
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
		
	}


	PriceList buyprices = new PriceList();
	PriceList sellprices = new PriceList();
	
	

	private void update()  {
		
		
		
		try {
			addNewPrices();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		try {
			performTrades();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}


	
	private void performTrades() {
		
		
	}


	private void addNewPrices() throws Exception{
		
		String buypricedata = Coinbase.getHttp("https://coinbase.com/api/v1/prices/buy", null) ;
		JsonObject buypricejson = JsonObject.readFrom( buypricedata );
		String buypricetext = buypricejson.get( "amount" ).asString();
		float buyprice = Float.parseFloat( buypricetext );
		buyprices.add(buyprice);
		
		String sellpricedata = Coinbase.getHttp("https://coinbase.com/api/v1/prices/sell", null) ;
		JsonObject sellpricejson = JsonObject.readFrom( sellpricedata );
		String sellpricetext = sellpricejson.get( "amount" ).asString();
		float sellprice = Float.parseFloat( sellpricetext );
		sellprices.add(sellprice);
		
		
		
	}
	
	
	
}
