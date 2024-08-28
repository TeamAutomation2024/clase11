Feature: Login
  @successful
  Scenario: Login exitoso
    Given ingreso al sistema con el rol "Admin"
    When ingreso las credenciales
    Then se muestra la web principal
