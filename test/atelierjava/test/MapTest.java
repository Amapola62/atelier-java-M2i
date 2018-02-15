/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.HashMap;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class MapTest {
    @Test
    public void mapKeySetOK() {
       HashMap<String, String>paysCapitales = new HashMap<>();
       
       paysCapitales.put("France", "Paris");
       paysCapitales.put("Espagne", "Madrid");
       paysCapitales.put("Indonésie","Jakarta"); 
       
       Set<String> cles = paysCapitales.keySet();
       
       for ( String pays : cles) {
           System.out.println( pays +" : "+paysCapitales.get(pays));
       }
    }
    
   @Test
   public void mapPutGetOk(){
       HashMap<String, String>paysCapitales = new HashMap<>();
       
       paysCapitales.put("France", "Paris");
       paysCapitales.put("Espagne", "Madrid");
       paysCapitales.put("Indonésie","Jakarta");
       
       String resultat = paysCapitales.get("Indonésie");
       System.out.println( resultat );
   }
}


