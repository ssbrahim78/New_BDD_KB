package webPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Term_LifePage {


    static final  String  SearchBoxID="twotabsearchtextbox";
    @FindBy(how= How.ID,using=SearchBoxID)
    public static WebElement SearchBox;
    static final  String  SearchBoxButtonID="nav-search-submit-button";
    @FindBy(how= How.ID,using=SearchBoxButtonID)
    public static WebElement SearchBoxButton;

}
