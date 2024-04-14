package pl.edu.wszib.springjpa.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Praca {

  @Id
  @GeneratedValue
  private long id;
  private String nazwaFirmy;
  private String pracaOd;
  private String pracaDo;
  private String stanowisko;
  private Instant createdAt;
  private Instant updatedAt;

  @ManyToOne
  @JoinColumn
  private CV cv;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNazwaFirmy() {
    return nazwaFirmy;
  }

  public void setNazwaFirmy(String nazwaFirmy) {
    this.nazwaFirmy = nazwaFirmy;
  }

  public String getPracaOd() {
    return pracaOd;
  }

  public void setPracaOd(String pracaOd) {
    this.pracaOd = pracaOd;
  }

  public String getPracaDo() {
    return pracaDo;
  }

  public void setPracaDo(String pracaDo) {
    this.pracaDo = pracaDo;
  }

  public String getStanowisko() {
    return stanowisko;
  }

  public void setStanowisko(String stanowisko) {
    this.stanowisko = stanowisko;
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

  public CV getCv() {
    return cv;
  }

  public void setCv(CV cv) {
    this.cv = cv;
  }
}
