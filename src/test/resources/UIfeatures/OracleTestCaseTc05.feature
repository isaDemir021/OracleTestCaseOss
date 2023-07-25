@OracleTC05
Feature:US OracleGroup Test Case
  Scenario: :Met de juiste gebruikersnaam , het verkeerde wachtwoord mag niet ingelogd worden.
    Given Gebruiker gaat naar de website
    Then Typ de juiste gebruikersnaam in het gebruikersnaamvak
    And typ het verkeerde wachtwoord in het wachtwoordvak
    And klikt op de inlogknop
    And close driver

    # Negatief Scenario:
