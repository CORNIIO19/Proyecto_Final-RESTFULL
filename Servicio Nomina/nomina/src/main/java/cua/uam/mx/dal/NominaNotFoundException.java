package cua.uam.mx.dal;

class NominaNotFoundException extends RuntimeException {

    NominaNotFoundException(Integer id) {
      super("Could not find nomina " + id);
    }
  }