package cua.uam.mx.dal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class NominaNotFoundAdvice {

  @ExceptionHandler(NominaNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String nominaNotFoundHandler(NominaNotFoundException ex) {
    return ex.getMessage();
  }
}
