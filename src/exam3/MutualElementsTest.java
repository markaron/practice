package exam3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MutualElementsTest {

  MutualElements mutualElements;
  List<Integer> a;
  List<Integer> b;

  @Before
  public void setUp() throws Exception {
    mutualElements = new MutualElements();
    a = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 3, 4, 3, 4, 4, 4));
    b = new ArrayList<Integer>(Arrays.asList(3, 2, 4, 4, 5, 6, 7));
  }

  @Test
  public void filterMutualElementsMoreThanTwo() {
    List<Integer> expResult = new ArrayList<>(Arrays.asList(2,3,4));
    assertEquals(expResult, mutualElements.filterMutualElements(a,b));
  }
}