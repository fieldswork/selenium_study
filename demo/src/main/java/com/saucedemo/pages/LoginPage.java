package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    // Make sure to extend BasePage so we can access its methods!

    // Our POM should reflect the application - 
    // In the application, a different page does not have access to the fields
    // that are on the login page. Therefore, we should make these fields private.
    // To make these fields accessable, we'll make public setter methods!
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("#login_button_container h3");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    // This is a transition method - it must NOT have `void` as a return type
    // By transition method, we're referring to how the page transitions from
    // the login page to the ProductsPage - this interaction must be modeled by
    // returning a new ProductsPage after the button is clicked.
    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    // We'll make a convenience method to perform the 3 methods above:
    // Note that since this includes a transition method, we'll have to make this
    // a transition method as well, returning `clickLoginButton()`.
    public ProductsPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
