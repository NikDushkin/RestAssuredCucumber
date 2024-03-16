package Reqresin.dto.requestDto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LoginUserDto {
    private String email;
    private String password;
}
