package Reqresin.template;

import Reqresin.dto.requestDto.EmailPasswordDto;
import Reqresin.dto.responseDto.SuccessfulLoginBodyResponse;
import Reqresin.dto.responseDto.SuccessfulRegisterBodyResponse;

public class registerUserData {
    public static EmailPasswordDto getValidDataForRegisterUser(){
        return new EmailPasswordDto().builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
    }
    public static EmailPasswordDto getInvalidDataForRegisterUser(){
        return new EmailPasswordDto().builder()
                .email("eve.holt@reqres.in")
                .build();
    }
    public static SuccessfulRegisterBodyResponse getSuccessfulRegisterBodyResponse(){
        return new SuccessfulRegisterBodyResponse().builder()
                .id(4)
                .token("QpwL5tke4Pnpja7X4")
                .build();
    }
}
