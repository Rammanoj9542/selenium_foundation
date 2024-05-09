package Testcases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.ReadXLSdata;

public class Brilliustest extends BaseTest{
	
//	@Test
//	public static void SuperAdminLoginTest() throws InterruptedException {
//	
//		driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("superadmin");
//		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Brillius@123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
//		Thread.sleep(2000);
//		
//		WebElement superadminPageElement = driver.findElement(By.xpath(loc.getProperty("Spacesbtn"))); 
//
//	    if (superadminPageElement.isDisplayed()) {
//	        System.out.println("Super Admin page is visible. Login successful!");
//	        
//	    } else {
//	        System.out.println("Super Admin page is not visible. Login failed!");
//	        
//	    }
//	}
	
	
  @Test
   public static void superadmin() throws InterruptedException {
		
		
		driver.findElement(By.id(login.getProperty("username_field"))).sendKeys("superadmin");
	    driver.findElement(By.id(login.getProperty("password_field"))).sendKeys("Brillius@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath(login.getProperty("login_next_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(superadmin.getProperty("Spacesbtn"))).click();
		driver.findElement(By.xpath(superadmin.getProperty("btnadd"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(superadmin.getProperty("inptspacename"))).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath(superadmin.getProperty("Selectusecae"))).click();
		String Selectusecase = "//div[contains(text(),'Training')]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(Selectusecase)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(superadmin.getProperty("btnaddspace"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(superadmin.getProperty("btnview"))).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath(superadmin.getProperty("btnaccess"))).click();
		driver.findElement(By.xpath(superadmin.getProperty("btnuser"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(superadmin.getProperty("btnregister"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(superadmin.getProperty("first_name"))).sendKeys("siva");
   	    driver.findElement(By.xpath(superadmin.getProperty("last_name"))).sendKeys("sai");
    	driver.findElement(By.xpath(superadmin.getProperty("email_address"))).sendKeys("sai12456@gmail.com");
    	driver.findElement(By.xpath(superadmin.getProperty("user_name"))).sendKeys(superadmin.getProperty("uname"));
    	driver.findElement(By.xpath(superadmin.getProperty("pwd"))).sendKeys("Saii@1112");
    	driver.findElement(By.xpath(superadmin.getProperty("contact_number"))).sendKeys("9063767644");
    	driver.findElement(By.xpath(superadmin.getProperty("btnRegister"))).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath(superadmin.getProperty("btnmanage"))).click();
    	driver.findElement(By.xpath(superadmin.getProperty("btnassign"))).click();
        Thread.sleep(3000);
    	driver.findElement(By.xpath(superadmin.getProperty("selectspace"))).sendKeys("selenium");
    	driver.findElement(By.xpath(superadmin.getProperty("selectadmin"))).click();
    	driver.findElement(By.xpath("//div[contains(text(),'" + superadmin.getProperty("uname") + "')]")).click();
    	Thread.sleep(3000);
       	driver.findElement(By.xpath(superadmin.getProperty("btnassignadmins"))).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(superadmin.getProperty("btnmanage"))).click();
    	driver.findElement(By.xpath(superadmin.getProperty("btnunassign"))).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(superadmin.getProperty("selectspace"))).sendKeys("selenium");
     	Thread.sleep(3000);
     	driver.findElement(By.xpath(superadmin.getProperty("selectadmin"))).click();
     	Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[contains(text(),'" + superadmin.getProperty("uname") + "')]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(superadmin.getProperty("btnunassignadmins"))).click();
   	    Thread.sleep(3000);
		driver.findElement(By.xpath(superadmin.getProperty("Spacesbtn"))).click();
		driver.findElement(By.xpath(superadmin.getProperty("btnview"))).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath(superadmin.getProperty("btndlt"))).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(superadmin.getProperty("btnsltdltoption"))).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(superadmin.getProperty("btndltoption"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(logout.getProperty("btnclicklogout"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(logout.getProperty("btnhomeoption"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(logout.getProperty("btnclicklogout"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(logout.getProperty("btnlogoutoption"))).click();
	    Thread.sleep(3000);
	    
	
//}
//
//
//
//	@Test
//	public static void Admin() throws InterruptedException {
//		
		
	    driver.findElement(By.id(login.getProperty("username_field"))).sendKeys("manoj");
		driver.findElement(By.id(login.getProperty("password_field"))).sendKeys("Brillius@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath(login.getProperty("login_next_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(admin.getProperty("Hierarchiesbtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(admin.getProperty("btnadd"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(admin.getProperty("inptspacename"))).sendKeys("java");
		Thread.sleep(1000);
		driver.findElement(By.xpath(admin.getProperty("Selectusecse"))).sendKeys("Training");
		Thread.sleep(1000);
		driver.findElement(By.xpath(admin.getProperty("inpthierarchyname"))).sendKeys("unit1");
		Thread.sleep(2000);
		driver.findElement(By.xpath(admin.getProperty("btnaddhierarchy"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(admin.getProperty("btnview"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(admin.getProperty("btnaccess"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(admin.getProperty("btnRegister"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(admin.getProperty("first_name"))).sendKeys("siva");
    	driver.findElement(By.xpath(admin.getProperty("last_name"))).sendKeys("tej");
     	driver.findElement(By.xpath(admin.getProperty("email_address"))).sendKeys("siva2136@gmail.com");
    	driver.findElement(By.xpath(admin.getProperty("user_name"))).sendKeys("trainer");
    	driver.findElement(By.xpath(admin.getProperty("pwd"))).sendKeys("Siva@143");
    	driver.findElement(By.xpath(admin.getProperty("contact_number"))).sendKeys("9063767659");
    	driver.findElement(By.xpath(admin.getProperty("btnregister"))).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(admin.getProperty("btnmanage"))).click();
    	driver.findElement(By.xpath(admin.getProperty("btnassign"))).click();
    	Thread.sleep(3000);
     	driver.findElement(By.xpath(admin.getProperty("selectspace"))).sendKeys("java");
     	driver.findElement(By.xpath(admin.getProperty("selecthierarchy"))).sendKeys("unit1");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath(admin.getProperty("selectUsecaserole"))).sendKeys("Trainer");
        Thread.sleep(3000);
     	driver.findElement(By.xpath(admin.getProperty("btnassignusers"))).click();
     	Thread.sleep(3000);
     	driver.findElement(By.xpath(admin.getProperty("btnunassign"))).click();
     	Thread.sleep(3000);
    	driver.findElement(By.xpath(admin.getProperty("selectspace"))).sendKeys("java");
     	driver.findElement(By.xpath(admin.getProperty("selecthierarchy"))).sendKeys("unit1");
     	driver.findElement(By.xpath(admin.getProperty("selectusecaseroleunasgn"))).sendKeys("Trainer");
     	Thread.sleep(3000);
     	driver.findElement(By.xpath(admin.getProperty("btnunassignusers"))).click();
     	Thread.sleep(3000);
     	driver.findElement(By.xpath(admin.getProperty("Hierarchiesbtn"))).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath(admin.getProperty("btnview"))).click();
     	Thread.sleep(3000);
     	driver.findElement(By.xpath(admin.getProperty("btndlt"))).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath(admin.getProperty("btnsltdltoption"))).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath(admin.getProperty("btndlt"))).click();
     	Thread.sleep(2000);
		driver.findElement(By.xpath(logout.getProperty("btnclicklogout"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(logout.getProperty("btnhomeoption"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(logout.getProperty("btnclicklogout"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(logout.getProperty("btnlogoutoption"))).click();
		Thread.sleep(3000);
 }
  
@Test
    public static void Admin() throws InterruptedException {
	driver.findElement(By.id(login.getProperty("username_field"))).sendKeys("manoj");
	driver.findElement(By.id(login.getProperty("password_field"))).sendKeys("Brillius@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath(login.getProperty("login_next_button"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(admin.getProperty("Hierarchiesbtn"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnadd"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("inptspacename"))).sendKeys("java");
	Thread.sleep(1000);
	driver.findElement(By.xpath(admin.getProperty("Selectusecse"))).sendKeys("Trainee");
	Thread.sleep(1000);
	driver.findElement(By.xpath(admin.getProperty("inpthierarchyname"))).sendKeys("unit1");
	Thread.sleep(2000);
	driver.findElement(By.xpath(admin.getProperty("btnaddhierarchy"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnview"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnaccess"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnRegister"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("first_name"))).sendKeys("mani");
	driver.findElement(By.xpath(admin.getProperty("last_name"))).sendKeys("tej");
	driver.findElement(By.xpath(admin.getProperty("email_address"))).sendKeys("mani2@gmail.com");
	driver.findElement(By.xpath(admin.getProperty("user_name"))).sendKeys("trainee");
	driver.findElement(By.xpath(admin.getProperty("pwd"))).sendKeys("Mani@123");
	driver.findElement(By.xpath(admin.getProperty("contact_number"))).sendKeys("9063767600");
	driver.findElement(By.xpath(admin.getProperty("btnregister"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnmanage"))).click();
	driver.findElement(By.xpath(admin.getProperty("btnassign"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("selectspace"))).sendKeys("java");
	driver.findElement(By.xpath(admin.getProperty("selecthierarchy"))).sendKeys("unit1");
	Thread.sleep(2000);
	driver.findElement(By.xpath(admin.getProperty("selectUsecaserole"))).sendKeys("Trainee");
    Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnassignusers"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnunassign"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("selectspace"))).sendKeys("java");
	driver.findElement(By.xpath(admin.getProperty("selecthierarchy"))).sendKeys("unit1");
	driver.findElement(By.xpath(admin.getProperty("selectusecaseroleunasgn"))).sendKeys("Trainee");
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnunassignusers"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnconfig"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("slthierarchy"))).sendKeys("unit2");
	Thread.sleep(2000);
	driver.findElement(By.xpath(admin.getProperty("btnnext"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("sltsttclientapikey"))).sendKeys("GAJQ-8YJS-LP68-9SON");
	driver.findElement(By.xpath(admin.getProperty("sltsttffmflugfag"))).sendKeys("0");
	driver.findElement(By.xpath(admin.getProperty("practicesttdplyid"))).sendKeys("1848");
	driver.findElement(By.xpath(admin.getProperty("assmtsttdplyid"))).sendKeys("1848");
	Thread.sleep(2000);
	driver.findElement(By.xpath(admin.getProperty("sltragclientapikey"))).sendKeys("GAJQ-8YJS-LP68-9SON");
	driver.findElement(By.xpath(admin.getProperty("sltassmtragfag"))).sendKeys("0");
	driver.findElement(By.xpath(admin.getProperty("assmtragretrivaldplyid"))).sendKeys("1234");
	driver.findElement(By.xpath(admin.getProperty("practiceragflag"))).sendKeys("0");
	driver.findElement(By.xpath(admin.getProperty("practiceragretrivaldplyid"))).sendKeys("1234");
	Thread.sleep(2000);
	driver.findElement(By.xpath(admin.getProperty("sltllmclientapikey"))).sendKeys("GAJQ-8YJS-LP68-9SON");
	driver.findElement(By.xpath(admin.getProperty("sltassmtllmdplyid"))).sendKeys("A1B4");
	driver.findElement(By.xpath(admin.getProperty("practicellmdplyid"))).sendKeys("A1B3");
	driver.findElement(By.xpath(admin.getProperty("chatresetdplyid"))).sendKeys("A1B5");
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btnnext"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btncross"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("Hierarchiesbtn"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(admin.getProperty("btnview"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(admin.getProperty("btndlt"))).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(admin.getProperty("btnsltdltoption"))).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(admin.getProperty("btndlt"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(logout.getProperty("btnclicklogout"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(logout.getProperty("btnhomeoption"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(logout.getProperty("btnclicklogout"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(logout.getProperty("btnlogoutoption"))).click();
	Thread.sleep(2000);
	 
    }
  
//  
 //
//
//
@Test
  public static void users() throws InterruptedException {
	
	driver.findElement(By.id(login.getProperty("username_field"))).sendKeys("trainer");
	driver.findElement(By.id(login.getProperty("password_field"))).sendKeys("Siva@143");
	Thread.sleep(2000);
	driver.findElement(By.xpath(login.getProperty("login_next_button"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("selectspace"))).sendKeys("java");
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("selecthierarchy"))).sendKeys("unit1");
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("btnnext"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(users.getProperty("btnmanage"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(users.getProperty("choosefile"))).sendKeys("C:\\Users\\Ram Manoj\\OneDrive\\Desktop\\questions.yaml");
	Thread.sleep(3000);
	driver.findElement(By.xpath(users.getProperty("btnupload"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("questions"))).sendKeys("5");
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("btnsubmit"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("btnreset"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("choosefile"))).sendKeys("C:\\Users\\Ram Manoj\\OneDrive\\Desktop\\questions.yaml");
	Thread.sleep(3000);
	driver.findElement(By.xpath(users.getProperty("btnupload"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("questions"))).sendKeys("7");
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("btnsubmit"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("btndashboard"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("sltuser"))).sendKeys("trainer");
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("btntransaction"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users.getProperty("btnview"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(logout.getProperty("btnclicklogout"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(logout.getProperty("btnlogoutoption"))).click();
	Thread.sleep(3000);
	
	}	

//}

@Test
public static void users2trainee() throws InterruptedException {
	
	driver.findElement(By.id(login.getProperty("username_field"))).sendKeys("trainee1");
	driver.findElement(By.id(login.getProperty("password_field"))).sendKeys("Brillius@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath(login.getProperty("login_next_button"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users2trainee.getProperty("selectspace"))).sendKeys("java");
	Thread.sleep(2000);
	driver.findElement(By.xpath(users2trainee.getProperty("selecthierarchy"))).sendKeys("unit1");
	Thread.sleep(2000);
	driver.findElement(By.xpath(users2trainee.getProperty("btnnext"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(users2trainee.getProperty("sltaudio"))).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(users2trainee.getProperty("sltpractice"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(users2trainee.getProperty("btnstartsession"))).click();
	Thread.sleep(3000);

//	driver.findElement(By.xpath(logout.getProperty("btnclicklogout"))).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath(logout.getProperty("btnlogoutoption"))).click();
//	Thread.sleep(3000);
//	
	}	

}



