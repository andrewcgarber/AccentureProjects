package steps;

import net.serenitybdd.tutorials.ui.CategoryNavigationBar;
import net.serenitybdd.tutorials.ui.CurrentPage;
import net.serenitybdd.tutorials.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;
import model.Category;
import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

	EbayHomePage ebayHomePage;
	CurrentPage currentPage;
	CategoryNavigationBar categoryNavigationBar;
	
	@Step
	public void isOnTheHomePage() {
		// TODO Auto-generated method stub
		ebayHomePage.open();
		
	}
	
	@Step
	public void shouldSeePageTitleContining(String expectedTitle) {
		// TODO Auto-generated method stub
		assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
	}
	
	@Step
	public void navigatesToCategory(Category category){
		categoryNavigationBar.selectCategory(category);
	}
}
