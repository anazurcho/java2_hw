package ge.btu.db.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String image;

    @ToString.Exclude
    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    Post post;
}
