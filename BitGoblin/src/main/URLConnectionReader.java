package main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader 
{
	
	
	
    public static String HTTPRequest(String url) throws Exception {
        URL yahoo = new URL(url);
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;
        String body = "";

        while ((inputLine = in.readLine()) != null){
        	body+=inputLine;
        }
        in.close();
        
        
        
		return body;
    }
    
    
    
}
