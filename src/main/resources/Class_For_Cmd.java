import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
public class Class_For_Cmd {

	public static  WebDriver driver;


	@Given("user is able enter the app with valid url")
	public void user_is_able_enter_the_app_with_valid_url() {
		String projectPath=System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectPath+"//Server//chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


	}

	@Then("user is able to enter UN and Pw")
	public void user_is_able_to_enter_un_and_pw() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");	}

	@Then("he is able to click the lopgin")
	public void he_is_able_to_click_the_lopgin() {

		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("he is must navigate to homepage and close the browser")
	public void he_is_must_navigate_to_homepage_and_close_the_browser() {

		System.out.println("User is navigate to HomePage");
		driver.quit();


	}

	@Given("url open")
	public void url_open() {
		String projectPath=System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectPath+"//Server//chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("enter invalid Un and Pw")
	public void enter_invalid_un_and_pw() {
		driver.findElement(By.name("username")).sendKeys("Admin123");
		driver.findElement(By.name("password")).sendKeys("admi123");


	}

	@Then("click on login btn")
	public void click_on_login_btn() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("error message should come")
	public void error_message_should_come() {

		driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();

		System.out.println("user is not able to enter the home page");

	}







}
