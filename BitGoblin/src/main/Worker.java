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
			pingCoinbase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		System.out.println( "The current buy price of bitcoin is " + buyprices.getLatest()  );
		System.out.println( "The current sell price of bitcoin is " + sellprices.getLatest()  );
		
		
	}


	private void pingCoinbase() throws Exception{
		String buypricedata = URLConnectionReader.HTTPRequest("https://coinbase.com/api/v1/prices/buy") ;
		JsonObject buypricejson = JsonObject.readFrom( buypricedata );
		String buypricetext = buypricejson.get( "amount" ).asString();
		float buyprice = Float.parseFloat( buypricetext );
		buyprices.add(buyprice);
		
		String sellpricedata = URLConnectionReader.HTTPRequest("https://coinbase.com/api/v1/prices/sell") ;
		JsonObject sellpricejson = JsonObject.readFrom( sellpricedata );
		String sellpricetext = sellpricejson.get( "amount" ).asString();
		float sellprice = Float.parseFloat( sellpricetext );
		sellprices.add(sellprice);
	}
	
	
	
}
