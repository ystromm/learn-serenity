package com.github.ystromm.learn.serenity.ui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;

public class ValtYrke implements Question<String> {

    public String answeredBy(Actor actor) {
        return Value.of(ValtYrkeField.FIELD).viewedBy(actor).asString();
    }

    public static ValtYrke value() {
        return new ValtYrke();
    }
}
