package com.mexiti.costogasolina

import androidx.compose.ui.res.stringResource
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextInput
import com.mexiti.costogasolina.ui.theme.CostoGasolinaTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat


class CalcularMontoUITest {

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun calcular_Monto_40L_22_35() {
        // Rellenar campos
        composeRule.onNodeWithTag("Ingresa precio por litro de Gasolina")
            .performTextInput("22.35")
        composeRule.onNodeWithTag("Litros")
            .performTextInput("40")

        // Validar resultado
        val montoEsperado = NumberFormat.getCurrencyInstance().format(894.0)
        composeRule.onNodeWithTag("Monto Total")
            .assertTextEquals("Monto Total: $montoEsperado")
    }
}