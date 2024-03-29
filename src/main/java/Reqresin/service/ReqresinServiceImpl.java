package Reqresin.service;

import Reqresin.RestAssuredHelper;
import Reqresin.path.ReqresinPath;
import Reqresin.template.loginUserData;
import Reqresin.template.registerUserData;
import groovy.json.JsonOutput;

import java.util.Map;

import static Reqresin.RestAssuredHelper.RESPONSE;

public class ReqresinServiceImpl {
    RestAssuredHelper restAssuredHelper = new RestAssuredHelper();

    public void registerUserValidData(){
        restAssuredHelper.RequestPostPathAndBody(ReqresinPath.registerUser, JsonOutput.toJson(registerUserData.getValidDataForRegisterUser()));
    }
    public void registerUserInvalidData(){
        restAssuredHelper.RequestPostPathAndBody(ReqresinPath.registerUser, JsonOutput.toJson(registerUserData.getInvalidDataForRegisterUser()));
    }
    public void loginUserValidData(){
        restAssuredHelper.RequestPostPathAndBody(ReqresinPath.loginUser, JsonOutput.toJson(loginUserData.getValidDataForLoginUser()));
    }
    public void loginUserInvalidData(){
        restAssuredHelper.RequestPostPathAndBody(ReqresinPath.loginUser, JsonOutput.toJson(loginUserData.getInvalidDataForLoginUser()));
    }
    public void getSingleUser(String userId){
        restAssuredHelper.RequestGetPathAndPathParams(ReqresinPath.singleUser,
                Map.of("userId", userId));
    }
    public String getStatusCode(){
        return String.valueOf(RESPONSE.getStatusCode());
    }
    public String getResponseBody(){
        return RESPONSE.getBody().asString();
    }
}
