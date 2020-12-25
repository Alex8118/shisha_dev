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
@Table(name = "tobacco")
public class TobaccoEntity extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "trade_mark")//, nullable = false)
    private String tradeMark;

    @Column(name = "name")
    private String name;

    @Column(name = "taste")
    private String taste;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "type_of_leaf")
    private String typeOfLeaf;

    @Column(name = "heart_resistance")
    private String heartResistance;

    @Column(name = "country")
    private String country;

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

    @Column(name = "tobacco_file")
    @Lob
    private byte[] picture;

}
