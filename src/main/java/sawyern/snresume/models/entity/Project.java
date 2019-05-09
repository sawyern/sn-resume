package sawyern.snresume.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sawyern.snresume.models.DbItem;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PROJECT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project extends DbItem {
    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Skill> relevantSkills;
}
