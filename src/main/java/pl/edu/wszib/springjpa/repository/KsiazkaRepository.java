package pl.edu.wszib.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.model.Ksiazka;

import java.util.List;

@Repository
public interface KsiazkaRepository extends JpaRepository<Ksiazka, Integer> {

    List<Ksiazka> findAllByGatunek(String gatunek);

}
