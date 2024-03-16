package Reqresin.dto.responseDto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SingleUserResponseDto {
    private dataDto data;
    private supportDto support;
}
