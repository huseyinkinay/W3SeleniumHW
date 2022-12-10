import io.github.bonigarcia.wdm.WebDriverManager;

public class Methodlarim{


    public void gotoURL(String URL_){

        WebDriverManager.chromedriver().setup();
        Driver.driver.navigate().to(URL_);

    }
    public void actionToPerform(){

    }
    public static void click_byLinkText(){
        WebElementlerim.termsofuse.click();


    }
    public static void aramaTerimi(String aramametini){
        WebElementlerim.arama.sendKeys(aramametini);


    }
}
