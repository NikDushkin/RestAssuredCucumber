package Reqresin.dto;

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
