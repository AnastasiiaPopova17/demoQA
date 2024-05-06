package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LeftSideMenu;
import pages.SelectMenuPage;

public class SelectMenuTest extends BaseTest{
    @BeforeClass
    public void beforeClassPreconditions() {
        new HomePage(driver).clickOnWidgets();
        new LeftSideMenu(driver).clickOnSelectMenu();
    }

    @Test
    public void fillFromTest() {
        new SelectMenuPage(driver)
                .fillSelectOne("Mr.")
                .fillOldStyleSelectMenu("Red")
                .fillMultiSelect(new String[]{"Grenn", "Black"})
                .fillStandartMultiSelect(new String[] {"Volvo", "Opel"});
//        SelectMenuPage selectMenuPage = new SelectMenuPage(driver);
//        softAssert.assertTrue(verifySelectValue("Group 1, option 1"));
//        softAssert.assertTrue(verifySelectOne("Mr."));
//        softAssert.assertTrue(verifyOldStyleSelectMenu("Red"));
//        softAssert.assertTrue(verifyDropDownSelect("Green"));
//        softAssert.assertTrue(verifyStandartMultiplySelect("Volvo"));
//
//        softAssert.assertAll();
    }


}
