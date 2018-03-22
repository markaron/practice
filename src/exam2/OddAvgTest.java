package exam2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OddAvgTest {

  OddAvg oddAvg = new OddAvg();
  List<Integer> list1;
  List<Integer> list2;
  List<Integer> list3;

  @Before
  public void setUp() throws Exception {
    list1 = new ArrayList<>(Arrays.asList(23, 32, 12, 45, 3, 2, 4, 7));
    list2 = new ArrayList<>(Arrays.asList(-3, 12, 45, 2, 4, 7));
    list3 = new ArrayList<>(Arrays.asList(23, 32, 12, 45, 3, 2, 4, 7));
  }

  @Test
  public void oddAverageCase1() {
    assertEquals(19.5,19.5, oddAvg.oddAverage(list1));
  }

  @Test
  public void oddAverageCase2(){
    assertEquals(16.3,16.3, oddAvg.oddAverage(list2));
  }
}