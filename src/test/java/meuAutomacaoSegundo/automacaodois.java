package meuAutomacaoSegundo;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automacaodois {

	WebDriver  driver;
	@Before
	public void setUp() throws Exception {
		//codigo para mostrar o caminho do chrome
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// codigo para abrir o navegador
	 driver = new ChromeDriver();
	   //comando para passar o caimnho do site
	 driver.get("https://www.mercadolivre.com.br/");
	   // caminho para maximinizar o site
	 driver.manage().window().maximize();
	  //comando para pausa
	 Thread.sleep (4000);
	 driver.findElement(By.xpath("//*[@id=\"nav-header-menu\"]/a[2]")).click();
	 //comando para preencher texto
	 driver.findElement(By.name("//*[@id=\"login_user_form\"]/div[1]/div/div")).sendKeys("teste");
	 Thread.sleep(4000);
	 driver.findElement(By.name("password")).sendKeys("101010101");
	 Thread.sleep(4000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
