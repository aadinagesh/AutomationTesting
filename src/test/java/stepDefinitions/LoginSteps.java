package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
 static WebDriver driver;
	static String url="http://gcreddy.com/project/admin/login.php";

@Given("browser initialization")
public void browser_initialization() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\sel libs\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
    System.out.println("given");
}

@When("link access")
public void link_access() {
	driver.get(url);
	System.out.println("when");
}

@When("provide valid username and password")
public void provide_valid_username_and_password() {
	driver.findElement(By.name("username")).sendKeys("gcreddy");
	driver.findElement(By.name("password")).sendKeys("Temp@2020");	
	System.out.println("and when");
}

@Then("click on login button")
public void click_on_login_button() {
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	System.out.println("then");
	System.out.println("login successful");
}


}
