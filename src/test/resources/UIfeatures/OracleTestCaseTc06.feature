@OracleTC06
Feature:US OracleGroup Test Case
  Scenario: Met de verkeerde gebruikersnaam , het juiste wachtwoord mag niet ingelogd worden.
    Given Gebruiker gaat naar de website
    Then Typ de verkeerde gebruikersnaam in het gebruikersnaamvak
    And typ het juiste wachtwoord in het wachtwoordvak
    And klikt op de inlogknop
    And close driver

    # Negatief Scenario: