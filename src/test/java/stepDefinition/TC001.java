package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001 {
	WebDriver driver;
	@Given("Launch Browser")
	public void launch_Browser() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Testing Data\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	   
	}

	@When("Enter URL")
	public void enter_URL() {
	   driver.get("http://183.82.103.245/nareshit/login.php");
	}

	@Then("Enter UserName and Password")
	public void enter_UserName_and_Password() {
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Login completed");
	}

	@Then("Close Application")
	public void close_Application() {
		 driver.findElement(By.linkText("Logout")).click();
		 System.out.println("Logout Completed");
		 driver.close();
	}



}
