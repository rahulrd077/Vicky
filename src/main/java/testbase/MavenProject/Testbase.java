package testbase.MavenProject;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Testbase {
	
	 public static WebDriver driver ;
	 public static  Properties prop;
	
	public Testbase() {
		
		
		try {
			
			prop = new Properties();			
			
		FileInputStream file = new FileInputStream("D:\\Eclipse\\Workspace\\MavenProject\\Objectrepository.properties");
		
		
		prop.load(file);
		 
	}
	
		catch(Exception e) {
			
			e.printStackTrace();
	

}
	}
		
		public static void initialization() {
			
			String browserName = prop.getProperty("");
			
			if (browserName.equals("chrome"))
					{
				
				//added a comment
}
			
		}
		

}
