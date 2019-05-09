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
@Table(name = "INDUSTRY")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Industry extends DbItem {
    @Column(name = "NAME", unique = true, nullable = false)
    private String name;
}
