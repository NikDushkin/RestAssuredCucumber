package Reqresin.template;

import Reqresin.dto.requestDto.EmailPasswordDto;
import Reqresin.dto.responseDto.SuccessfulLoginBodyResponse;
import Reqresin.dto.responseDto.UnsuccessfulRegisterOrLoginBodyResponse;

public class loginUserData {
    public static EmailPasswordDto getValidDataForLoginUser(){
        return new EmailPasswordDto().builder()
                .email("eve.holt@reqres.in")
                .password("cityslicka")
                .build();
    }
    public static EmailPasswordDto getInvalidDataForLoginUser(){
        return new EmailPasswordDto().builder()
                .email("eve.holt@reqres.in")
                .build();
    }
    public static SuccessfulLoginBodyResponse getSuccessfulLoginBodyResponse(){
        return new SuccessfulLoginBodyResponse().builder()
                .token("QpwL5tke4Pnpja7X4")
                .build();
    }
    public static UnsuccessfulRegisterOrLoginBodyResponse getUnsuccessfulRegisterOrLoginBodyResponse(){
        return new UnsuccessfulRegisterOrLoginBodyResponse().builder()
                .error("Missing password")
                .build();
    }
}
