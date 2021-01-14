package com.tobacco.dto;

import com.tobacco.common.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserEntityDto {

    private String sub;

    private String given_name;

    private String family_name;

    private String nickname;

    private String picture;

    private String locale;

    private String updated_at;

    private String email;

    private String email_verified;


}
