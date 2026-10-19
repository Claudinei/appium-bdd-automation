package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApiDemosSteps {

    private final HomePage homePage = new HomePage();

    @Dado("que o aplicativo ApiDemos está aberto")
    public void aplicativoEstaAberto() {
        assertTrue(homePage.isAccessibilityVisible());
    }

    @Então("devo visualizar a opção {string}")
    public void devoVisualizarOpcao(String opcao) {
        assertTrue(homePage.isAccessibilityVisible());
    }
}