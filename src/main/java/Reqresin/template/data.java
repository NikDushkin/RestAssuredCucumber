package Reqresin.template;

import Reqresin.dto.responseDto.dataDto;

public class data {
    public static dataDto getDataAboutUser(){
        return new dataDto().builder()
                .id(2)
                .email("janet.weaver@reqres.in")
                .first_name("Janet")
                .last_name("Weaver")
                .avatar("https://reqres.in/img/faces/2-image.jpg")
                .build();
    }
}
