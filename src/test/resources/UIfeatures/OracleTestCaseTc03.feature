@OracleTC03
Feature:US OracleGroup Test Case
  Scenario: :Met juiste gebruikersnaam, juiste wachtwoord en verkeerde toegangscode mag niet ingelogd worden. (OTP ACTIEF)
    Given Gebruiker gaat naar de website
    Then Typ de juiste gebruikersnaam in het gebruikersnaamvak
    And typ het juist wachtwoord in het wachtwoordvak
    And klikt op de inlogknop
    And typ verkeerde toegangscode
    And klikt op de inlogknop
    And close driver

    # Negatief Scenario:
