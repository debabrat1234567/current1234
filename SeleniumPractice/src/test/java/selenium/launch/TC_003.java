package selenium.launch;

import org.openqa.selenium.By;

public class TC_003 extends BaseTest{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
init();
launch("chromebrowser");
navigateUrl("amazonurl");

selectOption("amazonsearchdropbox_id","Books");
typeText("amazonsearchtext_id","Harry Potter");
//typeText("amazonsearchtext_name","Harry Potter");

clickElement("amazonsearchbutton_xpath");


//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	
}
