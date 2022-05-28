//Otići na https://www.stealmylogin.com/demo.html, uneti bilo koje kredencijale za login, prisisnuti dugme.
//Izvršiti proveru da je, nakon logina, URL promenjen na https://example.com/ kroz grananje. Ako jeste, štampati “Nice”. Ako nije, štampati “Not nice.”
//Sve elemente koji se koriste smestiti u intuitivno imenovane promenljive.
//Kod na git, screen recording puštanja i izvršavanja testa na Drive.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class domaci {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThinkPad\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.stealmylogin.com/demo.html");

        driver.findElement(By.name("username")).sendKeys("Coje");
//
        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys("Coje12345");
        inputPassword.sendKeys(Keys.ENTER);

        String url = driver.getCurrentUrl();
        String expected = "https://example.com/";

        if (url.equals(expected)) {
            System.out.println("Nice.");

        }else{
            System.out.println("Not nice.");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
