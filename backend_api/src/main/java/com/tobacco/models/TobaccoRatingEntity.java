package com.tobacco.models;

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
@Accessors(chain = true)
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tobacco_rating")
public class TobaccoRatingEntity extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "tobacco_id")
    private Integer tobaccoId;

    @Column(name = "taste_estimate")
    private Double tasteEstimate;

    @Column(name = "dur_of_smok_estimate")
    private Double durationOfSmokingEstimate;

    @Column(name = "smokiness_estimate")
    private Double smokinessEstimate;

    @Column(name = "package_estimate")
    private Double packageEstimate;

    @Column(name = "comfort_in_work_estimate")
    private Double comfortInWorkEstimate;

}
