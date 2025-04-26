package cua.uam.mx.dal;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import cua.uam.mx.dal.entities.Nomina;


@RestController
class NominaController {

  private final NominaRepository repository;

  NominaController(NominaRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/nomina")
  List<Nomina> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/nomina")
  Nomina newNomina(@RequestBody Nomina newNomina) {
    return repository.save(newNomina);
  }

  // Single item
  
  @GetMapping("/nomina/{id}")
  Nomina one(@PathVariable Integer id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new NominaNotFoundException(id));
  }

  @PutMapping("/nomina/{id}")
  Nomina replaceNomina(@RequestBody Nomina newNomina, @PathVariable Integer id) {
    
    return repository.findById(id)
      .map(nomina -> {
        nomina.setRol(newNomina.getRol());
        nomina.setSalario(newNomina.getSalario());
        return repository.save(nomina);
      })
      .orElseGet(() -> {
        return repository.save(newNomina);
      });
  }

  @DeleteMapping("/nomina/{id}")
  void deleteNomina(@PathVariable Integer id) {
    repository.deleteById(id);
  }
}