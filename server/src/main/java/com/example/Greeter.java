package com.example;

/**
* classe d'accueil
*/
public class Greeter {
  
  /**
  * mon constructeur
  */
  public Greeter() {

  }
 
 
  /**
  * @param someone nom de la personne
  * @return message d'acceuil
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
