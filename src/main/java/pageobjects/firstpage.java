package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class firstpage {

	WebDriver driver;

	public firstpage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"popup-buttons\"]//button[1]")

	public WebElement accept;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]//li[4]//a[@title=\"Careers\"]")
	
	public WebElement career;
	
	
	@FindBy(xpath="//*[@class='btn btn-secondary']")
	
	public WebElement join;
	
	
	@FindBy(xpath="//ul//li//a[text()='Create your profile | Sign in']")
	
	public WebElement profile;
	
	
	@FindBy(xpath="//*[@id=\"Inp_Login_email\"]")
	
	public WebElement email;
	
	
	@FindBy(xpath="//*[@id=\"Inp_Login_password\"]")
	
	public WebElement password;
	
	
	@FindBy(xpath="//*[@type=\"submit\" and @value=\"Login\"]")
	
	public WebElement login;
	

	public WebElement accept() {

		return accept;
	}
	
	public WebElement career()
	{
		
		return career;
	}
	
	public WebElement join()
	{
		
		return join;
	}
	
	public WebElement profile()
	{
		
		return profile;
	}
	public WebElement email()
	{
		
		return email;
	}
	
	public WebElement password()
	{
		
		return password;
	}
	
	public WebElement login()
	{
		
		return login;
	}

}
