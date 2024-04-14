package pl.edu.wszib.springjpa;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import pl.edu.wszib.springjpa.model.ToDoStatus;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "todo2")
public class ToDo2 {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(nullable = false)
  private String zadanie;
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private ToDoStatus status;
  @Column(nullable = false)
  private Instant termin;
  @CreationTimestamp
  @Column(updatable = false)
  private Instant createdAt;
  @UpdateTimestamp
  private Instant updatedAt;

  public UUID getId() {
    return id;
  }

  public void setId(UUID integer) {
    this.id = integer;
  }

  public String getZadanie() {
    return zadanie;
  }

  public void setZadanie(String zadanie) {
    this.zadanie = zadanie;
  }

  public ToDoStatus getStatus() {
    return status;
  }

  public void setStatus(ToDoStatus status) {
    this.status = status;
  }

  public Instant getTermin() {
    return termin;
  }

  public void setTermin(Instant termin) {
    this.termin = termin;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
