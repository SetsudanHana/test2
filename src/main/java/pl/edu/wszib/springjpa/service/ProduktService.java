package pl.edu.wszib.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.springjpa.model.Produkt;
import pl.edu.wszib.springjpa.repository.ProduktRepository;

import java.util.List;

@Service
public class ProduktService implements CrudService<Produkt, Integer>{

    @Autowired
    private ProduktRepository repository;

    @Override
    public List<Produkt> list() {
        return repository.findAll();
    }

    @Override
    public Produkt get(Integer integer) {
        return repository.findById(integer).get();
    }

    @Override
    public Produkt create(Produkt produkt) {
        produkt.setId(null);
        return repository.save(produkt);
    }

    @Override
    public Produkt update(Produkt produkt) {
        return repository.save(produkt);
    }

    @Override
    public void delete(Integer integer) {
        repository.deleteById(integer);
    }
}
