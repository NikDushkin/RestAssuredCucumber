package Reqresin.dto.responseDto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UnsuccessfulRegisterOrLoginBodyResponse {
    private String error;
}
