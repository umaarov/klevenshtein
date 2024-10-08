import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LevenshteinTest {
    @Test
    fun testLevenshteinDistance() {
        assertEquals(0, "kitten".levenshtein("kitten"))
        assertEquals(3, "kitten".levenshtein("sitting"))
        assertEquals(1, "flaw".levenshtein("flaws"))
        assertEquals(2, "gumbo".levenshtein("gambol"))
    }
}