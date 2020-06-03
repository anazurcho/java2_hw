package ge.btu.db.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    List<Post> posts =new ArrayList<>();
}
