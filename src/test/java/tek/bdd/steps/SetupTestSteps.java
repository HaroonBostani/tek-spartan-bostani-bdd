package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {

    @Given("Open browser and navigate to retial app")
  public void openBrowserAndNavigate() {
       SetupBrowser();
  }

  @Then("Validate top letf corner is TEKSCHOOL")
  public void validateTopLeftLogo() {
  String text = getElementText(By.xpath("//a[@class='top-nav__logo active']"));
      System.out.println(text);
  }

  @Then("Close the browser")
  public void closeBrowser() {
        quitBrowser();
  }
}
