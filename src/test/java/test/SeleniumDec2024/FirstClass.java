package test.SeleniumDec2024;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class FirstClass {

	public void Launch() {
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.facebook.com/");
		browser.manage().window().maximize();
		browser.get("https://www.gmail.com/");
		browser.manage().window().minimize();
		WebDriver edge = new EdgeDriver();
		edge.get("https://www.facebook.com/");
		edge.manage().window().maximize();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass F = new FirstClass();
		F.Launch();
	
	}

}
