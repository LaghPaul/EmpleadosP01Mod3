package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestmontoBono {

    public TestmontoBono() {
    }
    @Test
    public void testmontoBono() {
        System.out.println("montoBono");
        Empleado empleado = new Empleado("1111", "Lucas", 20, 4);
        boolean esperado = true;
        boolean obtenido = empleado.bonoMonto();
        Assert.assertEquals(esperado, obtenido);
    }
}
