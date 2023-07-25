@OracleTC02
Feature:US OracleGroup Test Case
  Scenario: :Met juiste gebruikersnaam, juiste wachtwoord en toeganscode moet ingelogd worden.  (OTP ACTIEF)
    Given Gebruiker gaat naar de website
    Then Typ de juiste gebruikersnaam in het gebruikersnaamvak
    And typ het juist wachtwoord in het wachtwoordvak
    And klikt op de inlogknop
#        And typ toegangs code         Wachtwoord moet geweten worden om scenario uit te voeren ...
    And klikt op de inlogknop
    And close driver