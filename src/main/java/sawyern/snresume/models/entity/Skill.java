package sawyern.snresume.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sawyern.snresume.models.DbItem;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SKILL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Skill extends DbItem {
    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<SkillType> types;
}
