package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    By amountnNo = By.xpath("//input[@placeholder='amount']");
    By withdrawBtn = By.xpath("//button[normalize-space()='Withdraw']");
    By transaction = By.xpath("//span[@class='error ng-binding']");
    public void withdrawlTab(){
        clickOnElement(withdrawl);

    }
    public void withdrawlSomeAmount(){
        clearWebElementText(amountnNo);
        sendTextToElement(amountnNo,"50");
    }

    private void clearWebElementText(By amountnNo) {
    }

    public void clickOnWithdrawlButton(){
        clickOnElement(withdrawBtn);


    }
    public String getTransitionSuccessMessage(){
        return getTextFromElement(transaction);
}


}
