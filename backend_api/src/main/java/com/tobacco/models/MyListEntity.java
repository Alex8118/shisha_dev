package com.tobacco.models;

import javax.persistence.*;
import com.tobacco.common.Auditable;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MyList")
public class MyListEntity extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")//, nullable = false)
    private Integer userId;

    @Column(name = "tobacco_id")
    private Integer tobaccoId;

    @Column(name = "status", nullable = false)
    private MyListStatusEnum status = MyListStatusEnum.IN_PROGRESS;

    @Column(name = "order_position")
    private Integer orderPosition;

    @Column(name = "upload_file", nullable = false)
    @Lob
    private byte[] uploadFile;


}
