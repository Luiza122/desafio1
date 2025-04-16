import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void testAdicionarPontos() {
        Time time = new Time("Estrelas FC", "São Paulo");
        time.adicionarPontos(3);
        assertEquals(3, time.getPontos());
    }
}