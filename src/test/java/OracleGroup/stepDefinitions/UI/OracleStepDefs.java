package OracleGroup.stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import OracleGroup.pages.OraclePage;
import OracleGroup.utilities.ConfigReader;
import OracleGroup.utilities.Driver;
import OracleGroup.utilities.ReusableMethods;

public class OracleStepDefs {
    OraclePage oraclePage=new OraclePage();
    Faker faker=new Faker();
    @Given("Gebruiker gaat naar de website via een ip adres die niet in het ip addres lijst is.")
    public void gebruikerGaatNaarDeWebsiteViaEenIpAdresDieNietInHetIpAddresLijstIs() {
        Driver.getDriver().get(ConfigReader.getProperty("Oracle_Url"));
        ReusableMethods.bekle(2);
    }

    @Then("Typ de gebruikersnaam in het gebruikersnaamvak")
    public void typDeGebruikersnaamInHetGebruikersnaamvak() {
        oraclePage.gebruikersNaam.sendKeys(ConfigReader.getProperty("isaMail"));
        ReusableMethods.bekle(2);

    }

    @And("typ het wachtwoord in het wachtwoordvak")
    public void typHetWachtwoordInHetWachtwoordvak() {
        oraclePage.password.sendKeys(ConfigReader.getProperty("isaPassword"));
        ReusableMethods.bekle(2);
    }

    @And("klikt op de inlogknop")
    public void kliktOpDeInlogknop() {
        oraclePage.inloggen.click();
        ReusableMethods.bekle(2);

    }

    @Given("Gebruiker gaat naar de website")
    public void gebruikerGaatNaarDeWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("Oracle_Url"));
        ReusableMethods.bekle(2);
    }

    @Then("Typ de juiste gebruikersnaam in het gebruikersnaamvak")
    public void typDeJuisteGebruikersnaamInHetGebruikersnaamvak() {
        oraclePage.gebruikersNaam.sendKeys(ConfigReader.getProperty("isaMail"));
        ReusableMethods.bekle(2);
    }

    @And("typ het juist wachtwoord in het wachtwoordvak")
    public void typHetJuistWachtwoordInHetWachtwoordvak() {
        oraclePage.password.sendKeys(ConfigReader.getProperty("isaPassword"));
        ReusableMethods.bekle(2);

    }

    @Then("Typ de verkeerde gebruikersnaam in het gebruikersnaamvak")
    public void typDeVerkeerdeGebruikersnaamInHetGebruikersnaamvak() {
        oraclePage.gebruikersNaam.sendKeys(faker.internet().emailAddress());
        ReusableMethods.bekle(2);


    }

    @And("typ het verkeerde wachtwoord in het wachtwoordvak")
    public void typHetVerkeerdeWachtwoordInHetWachtwoordvak() {
        oraclePage.password.sendKeys(faker.internet().password());
        ReusableMethods.bekle(2);


    }

    @And("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }

    @And("typ verkeerde toegangscode")
    public void typVerkeerdeToegangscode() {
        oraclePage.toegangscode.sendKeys(faker.numerify("#####"));
        ReusableMethods.bekle(2);

    }

    @And("typ het juiste wachtwoord in het wachtwoordvak")
    public void typHetJuisteWachtwoordInHetWachtwoordvak() {
        oraclePage.password.sendKeys(ConfigReader.getProperty("isaPassword"));
        ReusableMethods.bekle(2);

    }

    @And("typ juiste toegangscode")
    public void typJuisteToegangscode() {

    }

    @Given("Gebruiker gaat naar de website via een ip adres die wel in het ip addres lijst is.")
    public void gebruikerGaatNaarDeWebsiteViaEenIpAdresDieWelInHetIpAddresLijstIs() {
        Driver.getDriver().get(ConfigReader.getProperty("Oracle_Url"));
        ReusableMethods.bekle(2);

    }

//    @And("typ toegangs code")
//    public void typToegangsCode() {
//    }
}
