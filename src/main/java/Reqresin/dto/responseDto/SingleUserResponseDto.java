package Reqresin.dto.responseDto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SingleUserResponseDto {
    private DataDto data;
    private SupportDto support;
}
