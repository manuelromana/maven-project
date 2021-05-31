package com.example;

/**
 * Ceci est ma class return.
 */
public class Greeter {

/** 
 * Ceci est mon constructeur.
 */
 public Greeter() {

  }
  
/**
 * @param someone nom de la personne
 * @return bonjour en String
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
