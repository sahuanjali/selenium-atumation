package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorIdentificaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			  //System.out.println("launch");
			System.setProperty("webdriver.chrome.driver", "E:\\CareerUSA\\Selenium\\chromedriver.exe");
				
				WebDriver cd = new ChromeDriver();
				//new url added for testing
				cd.get("http://newtours.demoaut.com/");
				
				cd.manage().window().maximize();
				String color=cd.findElement(By.name("userName")).getCssValue("color");
				System.out.println(color);
				String hex=Color.fromString(color).asHex();
				System.out.println(hex);
				if(hex.equals("#000000")) {
					System.out.println("pass");
				}
				else
				{
					
					System.out.println("fail");
				}
				
				
				
	

}
}