package tests;

import org.junit.Test;
import pages.GarminHomePage;

public class GarminLoginTest extends BaseTest {

    @Test
    public void GarminLogInTest() {

        String url = "https://connect.garmin.com/signin";
        String user = "ThisIsNotCorrectEmail";
        String password = "ThisIsNotCorrectPassword";

        GarminHomePage garminHomePage = new GarminHomePage(driver);
         garminHomePage.openSignInPage(url);

         tests.GarminLoginPage garminLoginPage = new tests.GarminLoginPage(driver);
         garminLoginPage.inputCredentials(user,password);








    }




















}
