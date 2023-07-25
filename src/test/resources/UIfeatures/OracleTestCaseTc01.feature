@OracleTC01
Feature: US OracleGroup Test Case
  Scenario: Gebruiker kan inloggen met een gebruikersnaam en wachtwoord via willekeurige IP adress, wanneer OTP PASSIEF is.
    Given Gebruiker gaat naar de website via een ip adres die niet in het ip addres lijst is.
    Then Typ de gebruikersnaam in het gebruikersnaamvak
    And typ het wachtwoord in het wachtwoordvak
    And klikt op de inlogknop
    And close driver






