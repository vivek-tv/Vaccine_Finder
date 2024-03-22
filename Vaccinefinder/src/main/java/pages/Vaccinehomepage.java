package pages;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vaccinehomepage {
	private WebDriver driver; 
	
	@FindBy(xpath ="//a[contains(text(),'Download Certificate')]") 
	private WebElement clickdownloadcertificate; 
	
	@FindBy(xpath="//strong[contains(text(),'whatsapp link')]")
	private WebElement whatsapplink;
	 
	@FindBy(xpath ="//button[contains(text(),'Cancel')]") 
	private WebElement clickcancel; 
 
	@FindBy(xpath="//span[contains(text(),'×')]")
	WebElement close;
	
	
	public Vaccinehomepage(WebDriver driver) 
	{ 
		 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	public void clickdownloadcertificate() 
	{
		
		clickdownloadcertificate.click(); 
	} 
	public void close()
	{
		
		close.click();
	}
	
	public void link() 
	{
		whatsapplink.click();
		
	}
	public void tab() throws InterruptedException
	{
		 Set<String> windowHandles = driver.getWindowHandles();
	     String parentHandle = driver.getWindowHandle();
	    
	        for (String handle : windowHandles) {
	            if (!handle.equals(parentHandle)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }
	        driver.switchTo().window(parentHandle);
	        Thread.sleep(3000);
	}
	public void clickcancel() 
	{ 
		clickcancel.click(); 

	}

}
