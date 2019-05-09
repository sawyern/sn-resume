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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ADDRESS")
public class Address extends DbItem {
    @Column(name = "LINE_1")
    private String line1;

    @Column(name = "LINE_2")
    private String line2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "ZIP")
    private String zip;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;
}
