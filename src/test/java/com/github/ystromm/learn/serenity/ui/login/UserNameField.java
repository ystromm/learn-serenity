package com.github.ystromm.learn.serenity.ui.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UserNameField {
    public static Target FIELD = Target.the("Användarnamn").located(By.id("username-field"));
}
