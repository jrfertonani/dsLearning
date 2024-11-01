package Back.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
@Entity
@Table(name = "tb_resource")
public class Resource implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
}
