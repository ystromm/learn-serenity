package com.github.ystromm.learn.serenity.tasks;

import com.github.ystromm.learn.serenity.ui.KandidatbankenPage;
import com.github.ystromm.ui.GoogleSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenKandidatbanken implements Task {

    KandidatbankenPage kandidatbankenPage;

    @Step("Open kandidatbanken")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(kandidatbankenPage)
        );
    }
}
