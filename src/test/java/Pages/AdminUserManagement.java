package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class AdminUserManagement 
{

	WebDriver driver;
	
	public AdminUserManagement(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath=".//a[@id='menu_admin_viewAdminModule']") WebElement adminLink;
	
	@FindBy(id="btnAdd") WebElement addUser;
	
	@FindBy(xpath=".//*[@id='systemUser_employeeName_empName']") WebElement empName;
	
	@FindBy(id="systemUser_userName") WebElement uname;
	
	@FindBy(how =How.XPATH, using = ".//*[@id='systemUser_password']") WebElement password;
	
	@FindBy(how=How.ID, using="systemUser_confirmPassword") WebElement confirmPassword;
	
	@FindBy(xpath=".//*[@id='btnSave']")WebElement save;
	
	
	
	
	public void add_User_To_Applictaion(String empName1,String username,String pass,String cpass)
	{
		
		adminLink.click();
		
		verifyAdminPanel();
		
		addUser.click();
		empName.sendKeys(empName1);
		uname.sendKeys(username);
		password.sendKeys(pass);
		confirmPassword.sendKeys(cpass);
        save.click();
        
        System.out.println("============User crearted============");
	}
	

	public void verifyAdminPanel()
	{
		
		boolean status=driver.getCurrentUrl().contains("admin");
		
		Assert.assertTrue(status);
		
		System.out.println("===========Congrates we are on Admin Page=========");
	}
	
	
	public void clickOnAdminLink()
	{
	
		
		adminLink.click();
	}
	
	public void clickonAddUser()
	{
		
		addUser.click();
	}
	
	
	public void typeEmpName()
	{
		empName.sendKeys("Alice Duval");
	}
	
	
	public void typeUserName()
	{
		uname.sendKeys("MukeshSelenium51");
	}
	
	public void typePassword()
	{
		password.sendKeys("Selenium");
	}
	
	public void typeConfirmPassword()
	{
		confirmPassword.sendKeys("Selenium");
	}
	
    public void clickOnSaveButton()
    {
    	
    	save.click();
    }
	
	
}
