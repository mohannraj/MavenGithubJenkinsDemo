package qsp;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MavenProjectDemo1 {

		@Parameters({"browser","version"})
		@Test
		public void mavenDemo2(String b, String v) throws Exception {
			DesiredCapabilities d = new DesiredCapabilities();
			d.setBrowserName(b);
			d.setVersion(v);
			d.setPlatform(Platform.WINDOWS);
			URL u = new URL("http://localhost:4444/wd/hub");
			WebDriver driver=new RemoteWebDriver(u,d);
			driver.get("http://demo.actitime.com/login.do");
			for(int i=0; i<10; i++)
			{	
				driver.findElement(By.id("username")).clear();
			    driver.findElement(By.id("username")).sendKeys("Mohan");
		    }
			driver.close();
	   }	
	}

