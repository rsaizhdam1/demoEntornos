package test;

import main.java.ReemplazarVocales;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ReemplazarVocalesTest {
    private ReemplazarVocales reemplazar;
    private String resul;
    @BeforeEach
    void setUp() {
        reemplazar =  new ReemplazarVocales();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test1() {
        resul = reemplazar.reemplazarVocalesPorNumeros("");
        assertEquals(resul, "");
    }
    @Test
    void test2() {
        resul = reemplazar.reemplazarVocalesPorNumeros("a");
        assertEquals("4", resul);
    }
    @Test
    void test3() {
        resul = reemplazar.reemplazarVocalesPorNumeros("e");
        assertEquals("3", resul);
    }
    @Test
    void test4() {
        resul = reemplazar.reemplazarVocalesPorNumeros("i");
        assertEquals("1", resul);
    }
    @Test
    void test5() {
        resul = reemplazar.reemplazarVocalesPorNumeros("o");
        assertEquals("0", resul);
    }
    @Test
    void test6() {
        resul = reemplazar.reemplazarVocalesPorNumeros("u");
        assertEquals("7", resul);
    }
    @Test
    void test7() {
        resul = reemplazar.reemplazarVocalesPorNumeros("g");
        assertEquals("g", resul);
    }
    @Test
    void test8() {
        resul = reemplazar.reemplazarVocalesPorNumeros("aa");
        assertEquals("44", resul);
    }
}