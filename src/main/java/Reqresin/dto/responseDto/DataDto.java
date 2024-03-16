package Reqresin.dto.responseDto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DataDto {
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
}
