package com.tobacco.exceptions;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class ApiError {

    public Date timestamp;

    public String error;

    public String details;
}
