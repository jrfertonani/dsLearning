package Back.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
@Entity
@Table(name = "tb_task")
public class Task extends Lesson{
    @Serial
    private static final long serialVersionUID = 1L;

    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight;

    @Column(columnDefinition = "TIMESTAMP WITHOUT")
    private Integer dueDate;

    public Task(){

    }

    public Task(Long id, String title, String position, Section section, String description, Integer questionCount, Integer approvalCount, Double weight, Integer dueDate) {
        super(id, title, position, section);
        this.description = description;
        this.questionCount = questionCount;
        this.approvalCount = approvalCount;
        this.weight = weight;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public Integer getApprovalCount() {
        return approvalCount;
    }

    public void setApprovalCount(Integer approvalCount) {
        this.approvalCount = approvalCount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getDueDate() {
        return dueDate;
    }

    public void setDueDate(Integer dueDate) {
        this.dueDate = dueDate;
    }
}
