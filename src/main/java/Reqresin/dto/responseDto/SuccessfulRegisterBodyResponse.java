package Reqresin.dto.responseDto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SuccessfulRegisterBodyResponse {
    private Integer id;
    private String token;
}
