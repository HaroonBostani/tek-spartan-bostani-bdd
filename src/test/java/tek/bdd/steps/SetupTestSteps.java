package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {

   /* @Given("Open browser and navigate to retial app")
  //public void openBrowserAndNavigate() {
       SetupBrowser();
  } */

  @Then("validate top left corner is TEKSCHOOL")
  public void validateTopLeftLogo() {
  String topLeftCornerText = getElementText(By.xpath("//a[@class='top-nav__logo active']"));
      System.out.println(topLeftCornerText);

      Assert.assertEquals("TEKSCHOOL", topLeftCornerText);
  }
        @Then("Validate sign in button is Enabled")
   public void validateSignInButoonEnabled() {
      boolean isSignInBtnEnalbed = isElementEnabled(By.id("signinLink"));

      Assert.assertTrue(isSignInBtnEnalbed);

  }

  /* @Then("Close the browser")
  public void closeBrowser() {
        quitBrowser();
  } */
}
