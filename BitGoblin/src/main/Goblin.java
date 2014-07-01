package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.gui.Menu;

public class Goblin {

	static BufferedReader br;
	
	

	
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
			receiveUserInput(input);
		}
				
	}

	private static void receiveUserInput(String input) {
		menu.receiveUserInput(input);
		
		System.out.println(menu);		
	}

	private static void init() throws Exception  {

		while(Coinbase.API_KEY==null || Coinbase.API_KEY.length() != 16){
		System.out.println("Please enter your coinbase API key:");
		 
		Coinbase.API_KEY = br.readLine();
		 }
		 
		while(Coinbase.API_SECRET==null || Coinbase.API_SECRET.length() != 32){
		System.out.println("Please enter your coinbase API secret:");
		
		Coinbase.API_SECRET = br.readLine();
		}
		
		
		
	}

	static Menu menu = new Menu();
	
	public static Menu getMenu() {
		
		return menu;
	}
	
	
	
	
	
}
