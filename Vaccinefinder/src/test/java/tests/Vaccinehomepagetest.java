package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Aboutpage;
import pages.Covidcasespage;
import pages.Vaccinehomepage;

public class Vaccinehomepagetest 
{
	public static RemoteWebDriver driver; 
	private Vaccinehomepage vaccinehomepage; 
	private Covidcasespage covidcasespage;
	private Aboutpage aboutpage;
	
	 String url="https://indian-vaccine.web.app";
	@BeforeTest
	public void Login()
	{
		driver= new ChromeDriver(); 
		vaccinehomepage = new Vaccinehomepage(driver);
		covidcasespage= new Covidcasespage(driver);
		aboutpage = new Aboutpage(driver);
		driver.get("url"); 
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void covidcasepagetest() 
	{
		covidcasespage.clickcovidcases();
		covidcasespage.dropdownstate();
		covidcasespage.dropdowndistrict();
		covidcasespage.btn();
		covidcasespage.clicktext();
		covidcasespage.clickpiechart();
	}
	@Test(priority=2)
	public void homepagetest() throws InterruptedException 
	{ 
		
		
		vaccinehomepage.clickdownloadcertificate();
		vaccinehomepage.link();
		vaccinehomepage.tab();
		vaccinehomepage.clickdownloadcertificate();
		vaccinehomepage.clickcancel();

	} 
	
	@Test(priority=3)
	public void aboutpg() throws InterruptedException
	{
		
		aboutpage.tab();
		aboutpage.cwin();
		aboutpage.tab();
		aboutpage.cancelabt();

	}

	@AfterTest 
	public void quit()
	{ 
				driver.quit(); 
	}
}
