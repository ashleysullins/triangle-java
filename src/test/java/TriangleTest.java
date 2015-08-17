import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instatiatesCorrectly() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_setsSide1() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(2, 2, testTriangle.getSide1());
  }

  @Test
  public void newTriangle_setsSide2() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(2, 2, testTriangle.getSide2());
  }

  @Test
  public void newTriangle_isEquilateral() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void newTriangle_isNotEquilateral() {
    Triangle testTriangle = new Triangle(17,2,2);
    assertEquals(false, testTriangle.isEquilateral());
  }

  @Test
  public void newTriangle_isIsosceles() {
    Triangle testTriangle = new Triangle(2,2,4);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void newTriangle_isNotIsosceles() {
    Triangle testTriangle = new Triangle(17,3,2);
    assertEquals(false, testTriangle.isIsosceles());
  }

  // @Test
  // public void isSquare_whenNotASquare_false() {
  //   Triangle testTriangle = new Triangle(2,4);
  //   assertEquals(false, testTriangle.isSquare());
  // }
  //
  // @Test
  // public void isSquare_allSidesEqual_true() {
  //   Triangle testTriangle = new Triangle(2,2);
  //   assertEquals(true, testTriangle.isSquare());
  // }
}
