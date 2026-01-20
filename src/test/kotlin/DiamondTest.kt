import org.example.Diamond
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class DiamondTest {

    @Test
    fun shouldBeReturnA() {
        //Given
        val expectedDiamond = "A"
        //When
        val actualDiamond = Diamond("A")
        //Then
        assertEquals(expectedDiamond, actualDiamond.result)
    }

    @Test
    fun shouldBeReturnB() {
        //Given
        val expectedDiamond = "B"
        //When
        val actualDiamond = Diamond("B")
        //Then
        assertEquals(expectedDiamond, actualDiamond.result)
    }
}