package sawyern.snresume.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sawyern.snresume.models.DbItem;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CERTIFICATION")
public class Certification extends DbItem {
    @Column(name = "ISSUER")
    private String issuer;

    @Column(name =  "NAME")
    private String name;

    @Column(name = "ACHIEVEMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date achievementDate;
}
