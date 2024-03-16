package Reqresin.template;

import Reqresin.dto.responseDto.supportDto;

public class support {
    public static supportDto getSupportAboutUser(){
        return new supportDto().builder()
                .url("https://reqres.in/#support-heading")
                .text("To keep ReqRes free, contributions towards server costs are appreciated!")
                .build();
    }
}
