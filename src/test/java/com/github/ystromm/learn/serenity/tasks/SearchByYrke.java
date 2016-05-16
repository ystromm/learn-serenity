package com.github.ystromm.learn.serenity.tasks;

import com.github.ystromm.learn.serenity.ui.YrkeField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SearchByYrke implements Task {

    private final String yrke;

    public SearchByYrke(String yrke) {
        this.yrke = yrke;
    }

    @Step("Search for #yrke")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(yrke)
                     .into(YrkeField.FIELD)
                     .thenHit(ENTER)
        );
    }

    public static SearchByYrke forTheTerm(String yrke) {
        return instrumented(SearchByYrke.class, yrke);
    }

}
