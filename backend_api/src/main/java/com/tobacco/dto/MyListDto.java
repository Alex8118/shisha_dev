package com.tobacco.dto;

import com.tobacco.models.MyListStatusEnum;
import com.tobacco.models.TobaccoEntity;
import lombok.*;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyListDto {

    private Integer id;

    private TobaccoDto tobaccoEntity;

    private MyListStatusEnum status;

    private Integer orderPosition;

}
