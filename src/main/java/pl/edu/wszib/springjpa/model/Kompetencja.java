package pl.edu.wszib.springjpa.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Kompetencja {

  @Id
  @GeneratedValue
  private Integer id;

  @Enumerated(EnumType.STRING)
  private KompetencjaRodzaj rodzaj;
  private String nazwa;
  private Integer stopien;
  private Instant createdAt;
  private Instant updatedAt;

  @ManyToOne
  @JoinColumn
  private CV cv;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public KompetencjaRodzaj getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(KompetencjaRodzaj rodzaj) {
    this.rodzaj = rodzaj;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public Integer getStopien() {
    return stopien;
  }

  public void setStopien(Integer stopien) {
    this.stopien = stopien;
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
