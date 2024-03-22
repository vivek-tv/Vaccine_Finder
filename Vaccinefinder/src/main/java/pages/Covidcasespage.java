package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Covidcasespage 
{
	
	private WebDriver driver; 

	@FindBy(xpath="//a[normalize-space()='Vaccine Finder']//following::a[normalize-space()='Covid Cases']")
	private WebElement clickcovidcases; 
	@FindBy(xpath="//select[@name='selectedState']")
	private WebElement state;
	@FindBy(xpath="//select[@name='selectedDistrict']")
	private WebElement district;
	@FindBy(xpath ="//button[@title='Text']") 
	private WebElement clicktext; 
	@FindBy(xpath ="//button[@title='Pie Chart']")
	private WebElement clickpiechart; 
	
	@FindBy(xpath="//button[@class='mt-2 btn btn-outline-info btn-sm']/..//*[name()='svg'][@role='presentation']")
	private WebElement refreshbtn;
	public Covidcasespage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements( driver,this);
	}
	public void clickcovidcases()
	{
		
		clickcovidcases.click(); 
	} 
	public void dropdownstate()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select sl = new Select(state);
		sl.selectByValue("Karnataka");
	}
	public void dropdowndistrict()
	{
		
		Select sl = new Select(district);
		sl.selectByIndex(2);
	}
	public void btn()
	{
		refreshbtn.click();
	}
	public void clicktext()  
	{
		
		clicktext.click(); 
	}
	public void clickpiechart() 
	{
		

		clickpiechart.click(); 
	}
	

}
