package com.exemplo;

/* Assumptions - são usados para definir condições que devem ser verdadeiras para
 * que um teste seja executado.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    void validarAlgoSomenteNoUsuarioVictoria(){
        Assumptions.assumeFalse("victoria".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }

}
