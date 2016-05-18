package com.github.ystromm.learn.serenity.features;

import com.github.ystromm.learn.serenity.tasks.OpenKandidatbanken;
import com.github.ystromm.learn.serenity.tasks.SearchByYrke;
import com.github.ystromm.learn.serenity.ui.ValtYrke;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.github.ystromm.learn.serenity.tasks.Login.login;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
public class SearchByYrkeStory {

    final Actor annaArbetsgivare = Actor.named("Anna Arbetsgivare");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenKandidatbanken openKandidatbanken;

    @Before
    public void annaCanBrowseTheWeb() {
        annaArbetsgivare.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void yrke_should_have_completion() {

        givenThat(annaArbetsgivare).wasAbleTo(openKandidatbanken);
        givenThat(annaArbetsgivare).wasAbleTo(login("test_user", "Abcd1234"));

        when(annaArbetsgivare).attemptsTo(SearchByYrke.forTheTerm("Guldsm"));

        then(annaArbetsgivare).should(seeThat(ValtYrke.value(), is("Guldsmed")));
    }
}
