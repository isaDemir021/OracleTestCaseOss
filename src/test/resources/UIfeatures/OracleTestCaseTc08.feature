@OracleTC04
Feature:US OracleGroup Test Case
  Scenario: Als OTP ACTIEF is en ip adres WEL overeenkomt, geen OTP zal gestuurd worden.
    Given Gebruiker gaat naar de website via een ip adres die wel in het ip addres lijst is.
    Then Typ de juiste gebruikersnaam in het gebruikersnaamvak
    And typ het juiste wachtwoord in het wachtwoordvak
    And klikt op de inlogknop
    And close driver