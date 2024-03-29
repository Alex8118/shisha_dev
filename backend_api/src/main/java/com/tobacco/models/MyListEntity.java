package com.tobacco.models;

import javax.persistence.*;
import com.tobacco.common.Auditable;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Accessors(chain = true)
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "my_list_table")
public class MyListEntity extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    @ManyToOne(fetch = FetchType.LAZY)
    private TobaccoEntity tobaccoEntity;

    @Column(name = "status", nullable = false)
    private MyListStatusEnum status = MyListStatusEnum.IN_PROGRESS;

    @Column(name = "order_position")
    private Integer orderPosition;

    @Column(name = "picture_url", nullable = false)
    private String userPicture;

}
