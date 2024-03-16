package Reqresin.template;

import Reqresin.dto.requestDto.RegisterUserDto;
public class registerUserData {
    public static RegisterUserDto getValidDataForRegisterUser(){
        return new RegisterUserDto().builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
    }
    public static RegisterUserDto getInvalidDataForRegisterUser(){
        return new RegisterUserDto().builder()
                .email("eve.holt@reqres.in")
                .build();
    }

}
