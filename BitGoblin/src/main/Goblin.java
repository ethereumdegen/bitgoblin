package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goblin {

	static BufferedReader br;
	
	
	static String coinbase_key;
	
	static String coinbase_secret;
	
	public static void main(String args[]){
		
		System.out.println("BitGoblin starting.");
		
		 br = new BufferedReader(new InputStreamReader(System.in));
				
		try {
			init();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
					
				
			Worker worker = new Worker();
			worker.start();
		
			
			 
		      
			while(true){
				
				
				
				try {
					
					update();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
			
			
	}

	private static void update() throws IOException {
		String input = br.readLine();
		
		if(input != null)
		{
		System.out.println("You entered "+ input);
		}
		
		
	}

	private static void init() throws Exception  {

		while(coinbase_key==null || coinbase_key.length() != 16){
		System.out.println("Please enter your coinbase API key:");
		 
		 coinbase_key = br.readLine();
		 }
		 
		while(coinbase_secret==null || coinbase_secret.length() != 32){
		System.out.println("Please enter your coinbase API secret:");
		
		 coinbase_secret = br.readLine();
		}
		
		
		
	}
	
	
	
	
	
}
