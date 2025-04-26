package cua.uam.mx.dal;


import cua.uam.mx.dal.entities.Nomina;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import org.springframework.lang.NonNull;

@Component
class NominaModelAssembler implements RepresentationModelAssembler<Nomina, EntityModel<Nomina>> {

  @Override
  @NonNull
  public EntityModel<Nomina> toModel(Nomina nomina) {

    return EntityModel.of(nomina,
        linkTo(methodOn(NominaController.class).one(nomina.getId())).withSelfRel(),
        linkTo(methodOn(NominaController.class).all()).withRel("nomina"));
  }
}
