import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validaerCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Victoria", LocalDate.of(2020,1,1));
        Assertions.assertEquals(4, pessoa.getIdade());
    }
}
