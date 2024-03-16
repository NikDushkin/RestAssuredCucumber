package Reqresin.dto;

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
