package sawyern.snresume.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sawyern.snresume.models.DbItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SKILL_TYPE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillType extends DbItem {
    @Column(name = "TYPE", unique = true, nullable = false)
    private String type;
}
