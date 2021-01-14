package com.tobacco.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TobaccoRatingDto {

    private Integer tobaccoId;

    private Double tasteEstimate;

    private Double durationOfSmokingEstimate;

    private Double smokinessEstimate;

    private Double packageEstimate;

    private Double comfortInWorkEstimate;

}
