package pl.edu.wszib.springjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
public class Produkt {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(nullable = false)
  private String nazwa;
  @Column(nullable = false)
  private Integer ilosc;
  @Column(nullable = false)
  private Float cena;

  @CreationTimestamp
  private Instant createdAt;
  @UpdateTimestamp
  private Instant updatedAt;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public Integer getIlosc() {
    return ilosc;
  }

  public void setIlosc(Integer ilosc) {
    this.ilosc = ilosc;
  }

  public Float getCena() {
    return cena;
  }

  public void setCena(Float cena) {
    this.cena = cena;
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
