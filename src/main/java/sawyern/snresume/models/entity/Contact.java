package sawyern.snresume.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sawyern.snresume.models.DbItem;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CONTACT")
public class Contact extends DbItem {

    @OneToOne(cascade = CascadeType.PERSIST)
    private Account account;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "SECONDARY_PHONE")
    private String secondaryPhone;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Address address;

    @Email
    @Column(name = "EMAIL")
    private String email;
}
