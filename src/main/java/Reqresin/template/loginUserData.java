package Reqresin.template;

import Reqresin.dto.requestDto.LoginUserDto;

public class loginUserData {
    public static LoginUserDto getValidDataForLoginUser(){
        return new LoginUserDto().builder()
                .email("eve.holt@reqres.in")
                .password("cityslicka")
                .build();
    }
    public static LoginUserDto getInvalidDataForLoginUser(){
        return new LoginUserDto().builder()
                .email("eve.holt@reqres.in")
                .build();
    }
}
