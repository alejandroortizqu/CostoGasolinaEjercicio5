package com.mexiti.costogasolina

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class CalcularMontoTest {

    @Test
    fun calcularMonto20l_24_93(){
        val precio = 22.35
        val cantLitros = 40.0
        val darPropina = false

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894.0)

        val montoActual = calcularMonto(precio,cantLitros,darPropina,0.0)

        assertEquals("Comparacion entre montos",montoEsperado,montoActual)

    }

}