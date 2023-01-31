import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    void setUp() {
        cupcake = new Cupcake("Lemon Drizzle", 4,"Box of Four Large Cupcakes", "Large");
    }

    @Test
    void canAddTopping() {
        assertThat(cupcake.addTopping()).isEqualTo("Candied Lemon");
    }

    @Test
    void addCupcakeBox() {
        assertThat(cupcake.addCupcakeBox()).isEqualTo("Box of six mini cupcakes");
    }

    @Test
    void sizeOfCupcakes() {
        assertThat(cupcake.sizeOfCupcakes()).isEqualTo("Mini cupcakes");
    }

    @Test
    void useByDate() {
        assertThat(cupcake.useByDate()).isEqualTo(LocalDate.of(2023,2,7));

    }



}