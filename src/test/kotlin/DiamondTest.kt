import org.example.Diamond
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class DiamondTest {

    @Test
    fun shouldBeReturnA() {
        //Given
        val expectedDiamond = "A"
        //When
        val actualDiamond = Diamond('A')
        //Then
        assertEquals(expectedDiamond, actualDiamond.result)
    }

    @Test
    fun shouldBeReturnB() {
        //Given
        val expectedDiamond = """
             A
            B B
             A
        """.trimIndent()

        //When
        val actualDiamond = Diamond('B')
        //Then
        assertEquals(expectedDiamond, actualDiamond.result)
    }

    @Test
    fun shouldBeReturnC() {
        //Given
        val expectedDiamond = """
             A
            B B
           C   C
            B B
             A
        """.trimIndent()

        //When
        val actualDiamond = Diamond('C')
        //Then
        assertEquals(expectedDiamond, actualDiamond.result)
    }

    @Test
    fun shouldBeReturnD() {
        //Given
        val expectedDiamond = """
                 A
                B B
               C   C
              D     D
               C   C
                B B
                 A
            """.trimIndent()

        //When
        val actualDiamond = Diamond('D')
        //Then
        assertEquals(expectedDiamond, actualDiamond.result)
    }
}