import org.junit.Test;
import static org.junit.Assert.*;

public class StringPermutationsCountTest {

    @Test
    public void testGetStringPermutationsCount_basicMatch() {
        // Test trường hợp có một hoán vị khớp với chuỗi s2
        int result = StringPermutationsCount.getStringPermutationsCount("", "abc", "abcba", 0);
        assertEquals(2, result); // "abc" và "cba" đều xuất hiện trong "abcba"
    }

    @Test
    public void testGetStringPermutationsCount_multipleMatches() {
        // Test trường hợp có nhiều hoán vị khớp với chuỗi s2
        int result = StringPermutationsCount.getStringPermutationsCount("", "abc", "abcbacb", 0);
        assertEquals(3, result); // "abc", "bac", và "cab" đều xuất hiện trong "abcbacb"
    }

    @Test
    public void testGetStringPermutationsCount_noMatches() {
        // Test trường hợp không có hoán vị nào của s1 xuất hiện trong s2
        int result = StringPermutationsCount.getStringPermutationsCount("", "abc", "xyz", 0);
        assertEquals(0, result); // Không có hoán vị nào của "abc" xuất hiện trong "xyz"
    }

    @Test
    public void testGetStringPermutationsCount_partialMatch() {
        // Test trường hợp có một phần của hoán vị xuất hiện nhưng không phải là toàn bộ chuỗi
        int result = StringPermutationsCount.getStringPermutationsCount("", "abc", "ab", 0);
        assertEquals(0, result); // "ab" không chứa bất kỳ hoán vị đầy đủ nào của "abc"
    }

    @Test
    public void testGetStringPermutationsCount_emptyS1() {
        // Test trường hợp chuỗi s1 rỗng
        int result = StringPermutationsCount.getStringPermutationsCount("", "", "abc", 0);
        assertEquals(0, result); // Chuỗi rỗng không có hoán vị nào trong "abc"
    }

    @Test
    public void testGetStringPermutationsCount_emptyS2() {
        // Test trường hợp chuỗi s2 rỗng
        int result = StringPermutationsCount.getStringPermutationsCount("", "abc", "", 0);
        assertEquals(0, result); // Chuỗi s2 rỗng nên không chứa bất kỳ hoán vị nào của "abc"
    }

    @Test
    public void testGetStringPermutationsCount_sameStrings() {
        // Test trường hợp s1 và s2 giống nhau
        int result = StringPermutationsCount.getStringPermutationsCount("", "abc", "abc", 0);
        assertEquals(1, result); // "abc" chính xác khớp với "abc"
    }
}
