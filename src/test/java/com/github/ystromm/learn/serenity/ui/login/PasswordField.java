package com.github.ystromm.learn.serenity.ui.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PasswordField {
    public static Target FIELD = Target.the("Lösenord").located(By.id("password-field"));
}
