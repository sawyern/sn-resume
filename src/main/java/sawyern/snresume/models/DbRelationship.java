package sawyern.snresume.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public abstract class DbRelationship {
    @Column(name = "START_EFF")
    private LocalDateTime startEff;

    @Column(name = "STOP_EFF")
    private LocalDateTime stopEff;

    @CreatedBy
    @Column(name = "CREATE_USER")
    private String createUser;

    @LastModifiedDate
    @Column(name = "MODIFY_DATE")
    private LocalDateTime modifyDate;
}
