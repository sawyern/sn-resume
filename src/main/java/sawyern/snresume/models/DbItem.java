package sawyern.snresume.models;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public abstract class DbItem {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(
            name = "uuid",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    private String id;

    @Column(name = "REVISION")
    @NonNull
    private Integer revision;

    @Column(name = "LAST_REVISION", nullable = false)
    @NonNull
    private boolean lastRevision;

    @CreatedDate
    @Column(name = "CREATE_DATE")
    @NonNull
    private LocalDateTime createDate;

    @Column(name = "MODIFY_DATE")
    @NonNull
    private LocalDateTime modifyDate;

    public DbItem() {
        this.revision = 1;
        this.lastRevision = true;
        this.createDate = LocalDateTime.now();
        this.modifyDate = LocalDateTime.now();
    }
}
