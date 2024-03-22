package pages;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aboutpage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'About')]")
	private WebElement clkabout;
	
	@FindBy(xpath="//strong[contains(text(),'Athul Nair')]")
	private WebElement prf;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancelabout;
	
	@FindBy(xpath = "//a[contains(text(),'CoWIN API Guidelines')]")
	private WebElement cowinbtn;
	
	public  Aboutpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickabout() 
	{ 
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(clkabout));
	
		clkabout.click();
	} 
	public void cancelabt()
	{
		cancelabout.click();
	}
	
	public void tab() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(prf));
		prf.click();
	    String parentHandle = driver.getWindowHandle();
	    driver.switchTo().window(parentHandle);        
	}
	public void cwin()
	{
		cowinbtn.click();
	}

}
