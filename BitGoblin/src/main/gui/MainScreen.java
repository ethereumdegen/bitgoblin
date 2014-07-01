package main.gui;

public class MainScreen extends Screen{

	@Override
	public static void executeOption(int option)
	{
		switch(option){
		case 1:
		
		
		}
		
	}
	
	
	@Override
	public String toString(){
		return "Please select an option:" + "\n" 
				+ "1. Set a new goal" + "\n" 
				+ "2. View goals" + "\n" 
				+ "3. View price history" + "\n" 
				+ "4. View transactions" + "\n" 
				+ "5. Shutdown" + "\n" 
				;	
	}
	
	
}
