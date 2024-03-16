package Reqresin.template;

import Reqresin.dto.responseDto.SupportDto;

public class support {
    public static SupportDto getSupportAboutUser(){
        return new SupportDto().builder()
                .url("https://reqres.in/#support-heading")
                .text("To keep ReqRes free, contributions towards server costs are appreciated!")
                .build();
    }
}
