package net.serenitybdd.tutorials.ui;

import org.openqa.selenium.By;

import model.Category;
import net.serenitybdd.core.pages.PageObject;

public class CategoryNavigationBar extends PageObject{
	public void selectCategory (Category category){
		$("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();;
	}
}
