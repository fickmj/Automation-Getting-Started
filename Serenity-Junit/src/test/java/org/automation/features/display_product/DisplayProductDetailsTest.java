package org.automation.features.display_product;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.automation.model.ListingItem;
import org.automation.steps.serenity.BuyerSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SerenityRunner.class)
public class DisplayProductDetailsTest {
    @Managed
    WebDriver driver;

    @Steps
    BuyerSteps buyer;

    @Test
    @WithTags( {
            @WithTag(type="priority",name="medium"),
            @WithTag(type="component",name="product")

    })

    public void display_product_details_from_the_search_list() {
        buyer.opens_home_page();
        buyer.searches_by_keyword("Docking station");

        ListingItem selectedListingItem = buyer.selects_listing(1);

        buyer.should_see_product_details_for(selectedListingItem);
        assertThat("asdf").isEqualTo("asdfasdf");

    }
}
