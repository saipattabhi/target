package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driver.base;
import pageobjects.firstpage;
import util.ExcelData;

public class firsttext extends base {

	WebDriver driver;

	@Test(dataProvider="databridge")

	public void first(String username,String password) throws IOException {

		driver = intializedriver();

		driver.get("https://www.cgi.com/en");

		firstpage fd = new firstpage(driver);

		fd.accept().click();

		fd.career().click();

		fd.join().click();

		fd.profile().click();

		fd.email().sendKeys(username);

		fd.password().sendKeys(password);

		fd.login().click();

		driver.quit();

	}
	@DataProvider
	public Object[][] databridge()
	{
		
		ExcelData config=new ExcelData("C:\\Users\\saipa\\Node\\data\\Worksheet.xlsx");
		
		
	int rows = config.getrow(0);
	
	
	Object[][] data=new Object[rows][2];
	
	
	for(int i=0;i<rows;i++)
	{
		data[i][0]=config.getexceldata(0, i, 0);
		
		data[i][1]=config.getexceldata(0, i, 1);
		
		
	}
		
		return data;
		
	}
	
	

}
