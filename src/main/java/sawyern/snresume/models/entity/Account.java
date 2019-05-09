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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ACCOUNT")
public class Account extends DbItem {
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "DOB")
    private Date birthday;

    @OneToOne
    private Contact contact;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Certification> certifications;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Skill> skills;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Experience> experiences;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Project> projects;
}
