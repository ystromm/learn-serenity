package com.github.ystromm.learn.serenity.tasks;

import com.github.ystromm.learn.serenity.ui.login.PasswordField;
import com.github.ystromm.learn.serenity.ui.login.UserNameField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.ENTER;

public class Login implements Task {
    private final String userName;
    private final String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userName)
                .into(UserNameField.FIELD));
        actor.attemptsTo(Enter.theValue(password)
                .into(PasswordField.FIELD).thenHit(ENTER));
    }

    public static Login login(String userName, String password) {
        return new Login(userName, password);
    }
}
