package sawyern.snresume.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sawyern.snresume.models.DbItem;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "EXPERIENCE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Experience extends DbItem {
    @Column(name = "EMPLOYER")
    private String employer;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Skill> skills;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Reference> references;

    @ManyToOne
    private Address address;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Industry> industries;
}
