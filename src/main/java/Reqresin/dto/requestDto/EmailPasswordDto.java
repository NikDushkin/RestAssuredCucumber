package Reqresin.dto.requestDto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmailPasswordDto {
    private String email;
    private String password;
}
