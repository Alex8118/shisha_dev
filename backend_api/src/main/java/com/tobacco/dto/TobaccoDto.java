package com.tobacco.dto;

import com.tobacco.models.MyListStatusEnum;
import com.tobacco.models.TobaccoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Lob;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TobaccoDto {

    private Integer id;

    private String tradeMark;

    private String name;

    private String taste;

    private Integer weight;

    private String typeOfLeaf;

    private String heartResistance;

    private Double tasteEstimate;

    private Double durationOfSmokingEstimate;

    private Double smokinessEstimate;

    private Double packageEstimate;

    private Double comfortInWorkEstimate;

    private byte[] picture;

}
