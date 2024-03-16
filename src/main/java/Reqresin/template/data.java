package Reqresin.template;

import Reqresin.dto.responseDto.DataDto;

public class data {
    public static DataDto getDataAboutUser(){
        return new DataDto().builder()
                .id(2)
                .email("janet.weaver@reqres.in")
                .first_name("Janet")
                .last_name("Weaver")
                .avatar("https://reqres.in/img/faces/2-image.jpg")
                .build();
    }
}
