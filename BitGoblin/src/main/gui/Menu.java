package main.gui;

public class Menu {

	public static Screen screen = new MainScreen();
	
	
	@Override
	public String toString()
	{
		return screen.toString();	
	}


	public static void receiveUserInput(String input)
	{
		try{
			int option = Integer.parseInt(input);
			
			screen.executeOption(option);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}
