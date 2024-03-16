package Reqresin.steps;

import Reqresin.service.ReqresinServiceImpl;
import io.cucumber.java.bg.И;

import static groovy.json.JsonOutput.toJson;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReqresinSteps {
    ReqresinServiceImpl reqresinService = new ReqresinServiceImpl();
    @И("Выполнить POST запрос api.register с валидными данными")
    public void createUserValidData() {
        reqresinService.registerUserValidData();
    }
    @И("Статус код ответа {int}")
    public void checkStatusCode(Integer expectedStatusCode) {
        assertEquals(String.valueOf(expectedStatusCode), reqresinService.getStatusCode());
    }
    @И("Проверить тело ответa после регистрации")
    public void checkResponseBodyAfterRegister() {
        assertEquals(reqresinService.CORRECT_BODY_REGISTER_RESPONSE, reqresinService.getResponseBody());
    }

    @И("Выполнить POST запрос api.register без пароля")
    public void createUserInvalidData() {
        reqresinService.registerUserInvalidData();
    }
    @И("Проверить ошибку в ответе")
    public void checkBodyErrorAfterRegister() {
        assertEquals(reqresinService.MISSING_PASSWORD_ERROR, reqresinService.getResponseBody());
    }
    @И("Выполнить POST запрос api.login с валидными данными")
    public void loginUserValidData() {
        reqresinService.loginUserValidData();
    }
    @И("Проверить тело ответа после входа с валидными данными")
    public void checkResponseBodyAfterLogin() {
        assertEquals(reqresinService.CORRECT_BODY_LOGIN_RESPONSE, reqresinService.getResponseBody());
    }

    @И("Выполнить POST запрос api.login без пароля")
    public void loginUserInvalidData() {
        reqresinService.loginUserInvalidData();
    }
}