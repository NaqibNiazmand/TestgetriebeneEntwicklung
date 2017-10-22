package A1_3;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectTester {
  Project TDDSeq;

  @Before
  public void setUp(){
	  TDDSeq = new Project( new String[][]{{"A", "C"}, {"C", "D"}, {"B", "C"}});
  }
  
  @Test
  public void TDD() {
    assertTrue(TDDSeq.isWellSorted(new String[]{}));
  }
}
    