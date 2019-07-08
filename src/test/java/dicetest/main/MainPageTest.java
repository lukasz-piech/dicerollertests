package dicetest.main;

import org.junit.*;
import org.openqa.selenium.WebDriver;

import dicetest.main.Init;
import pageObjects.MainPage;

public class MainPageTest {
	WebDriver driver;
	MainPage mp = new MainPage();
	
	@Before
	public void start() {
		System.out.println("Start testu");
		driver = Init.getDriver();
	}
	
	@Test
	public void testStrony() {
		mp.nwodClicker();
		mp.ikFiller("5");
		mp.rollClicker();
		Init.sleep(10);
	}
	
	@After
	public void close() {
		Init.close();
		System.out.println("Koniec testu");
	}
	
}
