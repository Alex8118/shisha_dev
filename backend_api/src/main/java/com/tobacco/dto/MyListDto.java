package com.tobacco.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.tobacco.models.MyListStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyListDto {

    private Integer id;

    @NotNull
    private Integer tobaccoId;

    @NotNull
    private MyListStatus status;

    @NotNull
    private Integer orderPosition;

    @NotNull
    private byte[] uploadFile;
}
