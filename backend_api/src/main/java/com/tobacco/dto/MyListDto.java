package com.tobacco.dto;

import com.tobacco.models.MyListStatusEnum;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyListDto {

    private Integer id;

    private Integer tobaccoId;

    private MyListStatusEnum status;

    private Integer orderPosition;

}
