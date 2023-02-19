import org.example.services.RelaxCalculateService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RelaxCalculatorServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/TestData.csv")
    public void serviceTest(int income, int expences, int threshold, int count) {
        RelaxCalculateService service = new RelaxCalculateService();
        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(count, actual);

    }


}
