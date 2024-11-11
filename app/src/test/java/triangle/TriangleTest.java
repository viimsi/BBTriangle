package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testS1BiggerThanSumOfS2andS3() {
        Triangle triangle = new Triangle(10,1,1);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testS2BiggerThanSumOfS1andS3() {
        Triangle triangle = new Triangle(1,10,1);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testS3BiggerThanSumOf1andS2() {
        Triangle triangle = new Triangle(1,1,10);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testS1isZero() {
        Triangle triangle = new Triangle(0,1,1);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testS2isZero() {
        Triangle triangle = new Triangle(1,0,1);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testS3isZero() {
        Triangle triangle = new Triangle(1,1,0);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testS1andS2areZero() {
        Triangle triangle = new Triangle(0,0,1);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testS2andS3areZero() {
        Triangle triangle = new Triangle(1,0,0);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testS1andS3areZero() {
        Triangle triangle = new Triangle(0,1,0);

        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testAllSidesAreZeroes() {
        Triangle triangle = new Triangle(0,0,0);

        assertEquals("impossible", triangle.classify());
    }

    /*@Test
    void testAllSidesAreStrings() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle("a", "b", "c"));
    }

    @Test
    void testAllSidesAreNulls() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(null, null, null));
    }

    @Test
    void testAllSidesAreEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle("", "", ""));
    }
*/

    @Test
    void testTriangleIsEquilateral() {
        Triangle triangle = new Triangle(5,5,5);
        assertEquals("equilateral", triangle.classify());
    }

    @Test
    void testTriangleIsNotEquilateralWithSidesAsZeroes() {
        Triangle triangle = new Triangle(0,0,0);
        assertNotEquals("equilateral", triangle.classify());
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void testTriangleisRightAngle() {
        Triangle triangle = new Triangle(5,3,4);
        assertEquals("right-angled", triangle.classify());
    }

    @Test
    void testTriangleIsNotRightAngle() {
        Triangle triangle = new Triangle(5,4,4);
        assertNotEquals("right-angled", triangle.classify());
        assertEquals("isosceles", triangle.classify());
    }

    @Test
    void testTriangleIsScalene() {
        Triangle triangle = new Triangle(7,2,6);
        assertEquals("scalene", triangle.classify());
    }

    @Test
    void testTriangleIsIsoscelesWthEqualS2andS3() {
        Triangle triangle = new Triangle(1,10,10);
        assertEquals("isosceles", triangle.classify());
    }

    @Test
    void testTriangleIsIsoscelesWthEqualS1andS3() {
        Triangle triangle = new Triangle(10,1,10);
        assertEquals("isosceles", triangle.classify());
    }

    @Test
    void testTriangleIsIsoscelesWthEqualS1andS2() {
        Triangle triangle = new Triangle(10,10,1);
        assertEquals("isosceles", triangle.classify());
    }
}