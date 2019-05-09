package sawyern.snresume.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sawyern.snresume.models.DbItem;

import javax.persistence.*;

@Entity
@Table(name = "REFERENCE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reference extends DbItem {

    @Column(name = "TITLE")
    private String title;

    @Column(name = "RELATIONSHIP")
    private String relationship;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CONTACT_ID")
    private Contact contact;
}
