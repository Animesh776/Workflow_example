import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.DriverClass.Drivers;

public class MYPROJECTONE {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Drivers.openChromeBrowser();
        driver.get("https://automationexercise.com/login");


        String title = driver.getTitle();
        String extitle = "Automation Exercise - Signup / Login";


        assert title != null;
        if (title.equals(extitle)) {
            System.out.println("Login/signup page is visible");
        } else {
            System.out.println("Not visible");
        }

         WebElement name = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));

        String EXname = "Login to your account";
        String a = name.getText();


        if (a.equals(EXname)) {
            System.out.println("Login to your account is visible");
        } else {
            System.out.println("Not visible");
        }

//Login page
		String userId = System.getenv("USER_ID");
        String userPass = System.getenv("USER_PASS");
			
        driver.findElement(By.name("email")).sendKeys(userId);
        driver.findElement(By.name("password")).sendKeys(userPass);
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();




    }
}
