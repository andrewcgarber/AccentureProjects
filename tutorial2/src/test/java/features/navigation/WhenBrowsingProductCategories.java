package features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver; 

import model.Category;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.NavigatingUser;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

	
	@Steps
	NavigatingUser mark;
	
	@Managed
	WebDriver browser;
	
	@Test
	public void shouldBeAbleToNavigateToTheMotorsCategory(){
		//Given
		mark.isOnTheHomePage();
		
		// When
		mark.navigatesToCategory(Category.Motors);
		
		//Then
		mark.shouldSeePageTitleContining("New & used cars");
	}
}
