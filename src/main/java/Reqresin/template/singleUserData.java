package Reqresin.template;

import Reqresin.dto.responseDto.SingleUserResponseDto;

import static Reqresin.template.data.getDataAboutUser;
import static Reqresin.template.support.getSupportAboutUser;

public class singleUserData {
    public static SingleUserResponseDto getSingleUserData(){
        return new SingleUserResponseDto().builder()
                .data(getDataAboutUser())
                .support(getSupportAboutUser())
                .build();
    }
}
