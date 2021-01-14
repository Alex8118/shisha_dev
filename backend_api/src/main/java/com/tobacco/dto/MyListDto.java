package com.tobacco.dto;

import com.tobacco.models.MyListStatusEnum;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyListDto {

    private Integer id;

    private TobaccoDto tobaccoEntity;

    private MyListStatusEnum status;

    private Integer orderPosition;

    private String userPicture;

}
