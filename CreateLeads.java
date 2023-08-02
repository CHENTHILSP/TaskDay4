package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeads {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Maximize the window
				driver.manage().window().maximize();

				// Load the url
				driver.get("http://leaftaps.com/opentaps/control/login/");

				// Locate username field
				WebElement username = driver.findElement(By.id("username"));

				// Enter password as DemoSalesManager
				username.sendKeys("DemoSalesManager");

				// Locate password field
				WebElement password = driver.findElement(By.id("password"));

				// Enter password as crmsfa
				password.sendKeys("crmsfa");

				// Click on the Login button
				WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
				loginButton.click();

				// Get title of the welcome page
				String welcomePageTitle = driver.getTitle();
				System.out.println("welcomePageTitle : " + welcomePageTitle);

				// Click on the crmsfa link
				WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
				crmsfa.click();

				// Get title of the MyHome page
				String HomePageTitle = driver.getTitle();
				System.out.println("HomePageTitle : " + HomePageTitle);

				// Click on the leads tab
				WebElement leadsTab = driver.findElement(By.linkText("Leads"));
				leadsTab.click();
				

				// Click on the create lead
				WebElement createLead = driver.findElement(By.linkText("Create Lead"));
				createLead.click();
				

				// Enter companyName as TestLeaf
				WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
				companyName.sendKeys("Testleaf");

				// Enter firstName as Ravi
				WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
				firstName.sendKeys("Rajan");

				// Enter lastName as Varma
				WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
				lastName.sendKeys("Varnish");

				// Enter firstName(local) as Tilak
				WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
				firstNameLocal.sendKeys("Tiagun");

				// Enter departmentName as Testing
				WebElement departmentName = driver.findElement(By.name("departmentName"));
				departmentName.sendKeys("Testing");
				

				// Enter description as 5 years Experienced
				WebElement description = driver.findElement(By.name("description"));
				description.sendKeys("3");
				

				// Enter email address as 0o7@outlook.com
				WebElement emailID = driver.findElement(By.id("createLeadForm_primaryEmail"));
				emailID.sendKeys("ashwinsp@gmail.com");
				
				
				WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select sourcedd = new Select(sourceDD);
				sourcedd.selectByIndex(1);
				
				WebElement IndustryeDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select Industryedd = new Select(IndustryeDD);
				Industryedd.selectByIndex(2);
				
				WebElement ownershipeDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select ownershipedd = new Select(ownershipeDD);
				ownershipedd.selectByIndex(3);
				

				// Click on the createLead button
				WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
				createLeadButton.click();
				

				// To close the window
				driver.close();
			}

		




	}


