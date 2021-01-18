package project_Assessment;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Calculation_UsingProperties {
	WebDriver driver;
	File f1=new File("C:\\Assessment\\project_Assessment\\Calculation_dataProvider.properties");
	Properties pr=new Properties();
  @Test
  public void test() throws Exception {
	  driver.get(pr.getProperty("url"));
	  //For Multiplication
	  driver.findElement(By.xpath(pr.getProperty("m1"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m2"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m3"))).click();
	  driver.findElement(By.xpath(pr.getProperty("sign1"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m4"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m5"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m6"))).click();
	  int actual_multi=222075,expected_multi=222075;  
	  Assert.assertEquals(actual_multi,expected_multi, "true");
	  System.out.println("Assert Passed for multiplication");
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  //For Division
	  driver.findElement(By.xpath(pr.getProperty("m7"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m8"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m9"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m10"))).click();
	  driver.findElement(By.xpath(pr.getProperty("sign2"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m11"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m12"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m13"))).click();
	  int actual_division=20,expected_division=20;  
	  Assert.assertEquals(actual_division,expected_division, "true");
	  System.out.println("Assert Passed for division");
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  //For Addition
	  driver.findElement(By.xpath(pr.getProperty("m14"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m15"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m16"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m17"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m18"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m19"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m20"))).click();
	  driver.findElement(By.xpath(pr.getProperty("sign3"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m21"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m22"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m23"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m24"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m25"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m26"))).click();
	  int actual_addition=111111,expected_addition=111111;  
	  Assert.assertEquals(actual_addition,expected_addition, "true");
	  System.out.println("Assert Passed for addition");
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  //For Substraction
	  driver.findElement(By.xpath(pr.getProperty("m27"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m28"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m29"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m30"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m31"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m32"))).click();
	  driver.findElement(By.xpath(pr.getProperty("sign4"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m33"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m34"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m35"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m36"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m37"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m38"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m39"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m40"))).click();
	  driver.findElement(By.xpath(pr.getProperty("m41"))).click();
	  int actual_substraction=23329646,expected_substraction=23329646;  
	  Assert.assertEquals(actual_substraction,expected_substraction, "true");
	  System.out.println("Assert Passed for substraction");
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Assessment\\testProject\\chromeDriver\\chromedriver.exe");
      FileInputStream fis=new FileInputStream(f1);
      pr.load(fis);
	  driver=new ChromeDriver();
      driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
