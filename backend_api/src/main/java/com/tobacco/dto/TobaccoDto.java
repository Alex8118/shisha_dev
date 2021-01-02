package com.tobacco.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    private Double totalEstimate;

    private byte[] picture;

}
