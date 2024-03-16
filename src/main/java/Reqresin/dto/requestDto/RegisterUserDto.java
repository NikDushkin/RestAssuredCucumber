package Reqresin.dto.requestDto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RegisterUserDto {
    private String email;
    private String password;
}
