package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		driver.manage().timeouts();
		WebElement eleDd = driver.findElementById("dropdown1");
		Select sc = new Select(eleDd);
		List<WebElement> li = sc.getOptions();
		int size = li.size();
		sc.selectByIndex(size-1);
		Thread.sleep(4000);
		driver.close();

	}

}
