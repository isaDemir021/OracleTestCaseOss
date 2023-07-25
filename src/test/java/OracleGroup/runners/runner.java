package OracleGroup.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Runner Class:
    TestNG`deki .xml file`larda belirttigimiz class`lari, package`leri veya method`lari nasil calistiriyorsak
    Cucumber Framework`unde de Runner Class`indaki tags parametresi ile belirttigimiz senaryoyu calistirabiliriz.

    Emre Bey`den:
    features ===> features'ların olduğu package`in yolunu ver(ContentRoot)
    glue ====> stepDefinition'ların olduğu package`in yolunu ver(Source Root)
    tags ====> çalıştırmak istediğin grubu yaz
 */

// Cucumber ile JUnit`in entegre olmasini saglayan test calistirici notasyonudur.
@RunWith(Cucumber.class)

// Senaryolarin nerede ve nasil calisacagi, hangi raporu kullanacagiyla alakali secenekleri ayarlariz.
@CucumberOptions(plugin = {"pretty",
        "html:src/test/resources/htmlReport/cucumberHooks.html", // uzerine yazmasin dersek, cucumbertc3 gibi devam edilmeli
        "json:target/json-reports/cucumber.json",
        "junit:src/test/resources/htmlReport/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"
},
        //rerun-> fail olan scenariolari belirtilen yoldaki txt dosya icinde gosterir.
        // plugin={"pretty"} bize consolda scenario`lar ile bilgi gosterir.

        features = "C:\\Users\\31657\\IdeaProjects\\Testcase-Software-Testing-OracleGroup\\src\\test\\resources\\UIfeatures",
        glue = {"OracleGroup/stepDefinitions/UI"}, // bu parametre ile code`larimizi yazdigimiz stepDefinition
        //package`ni belirtiriz
        tags = "@OracleTC01",
        dryRun = false, //dryRun=false test adimlarini control eder ve browser`i calistirir.
        //dryRun=true test adimlarini sadece kontrol eder.
        // default olarak false`tir.
        monochrome = true// pretty ifadesinden sonra monochrome=true kullanirsak scenario adimlarini tek
        // renk olarak(siyah) gosterir, monochrome=false kullanirsak renkli gosterir.
        // default fals`tir.



)

public class runner {

}

