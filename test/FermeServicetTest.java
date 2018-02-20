/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atelierjava.exercice_ferme.service.FermeService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class FermeServicetTest {
    
  @Test
  public void inscriptionOK() {
      FermeService service = new FermeService();
      service.inscription("Amapola62", "EaFnb72");
  }
  
  @Test(expected = RuntimeException.class)
  public void inscriptionKO() {
      FermeService service = new FermeService();
      service.inscription("Amapola62", "BerliozPlume");
  }
}
