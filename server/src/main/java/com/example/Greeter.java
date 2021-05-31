package com.example;

 
public class Greeter {
  
 /**
  * methode d'accueil
  */
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
