package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element List
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement usernameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SignIn_Element;

	
	public void insertUserName(String username) {
		usernameElement.sendKeys(username);
	}
	
	public void insertPassWord(String password) {
		Password_Element.sendKeys(password);
	}
	
	public void clickIn() {
		SignIn_Element.click();
	}
	}

