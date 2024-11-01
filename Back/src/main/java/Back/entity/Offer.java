package Back.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_offer")
public class Offer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edition;
    private String startMoment;
    private String endMoent;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "offer")
    private List<Resource> resources = new ArrayList<>();

    public Offer() {
    }

    public Offer(Long id, String edition, String startMoment, String endMoent, Course course, List<Resource> resources) {
        this.id = id;
        this.edition = edition;
        this.startMoment = startMoment;
        this.endMoent = endMoent;
        this.course = course;
        this.resources = resources;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getStartMoment() {
        return startMoment;
    }

    public void setStartMoment(String startMoment) {
        this.startMoment = startMoment;
    }

    public String getEndMoent() {
        return endMoent;
    }

    public void setEndMoent(String endMoent) {
        this.endMoent = endMoent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(id, offer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
