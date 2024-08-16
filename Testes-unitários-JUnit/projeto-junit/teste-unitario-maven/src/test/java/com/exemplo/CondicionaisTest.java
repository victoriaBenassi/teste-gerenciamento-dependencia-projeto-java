package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    void validarAlgoSomenteNoUsuarioVictoria(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
