@OracleTC07
Feature:US OracleGroup Test Case
  Scenario:OTP moet gestuurd worden wanneer OTP ACTIEF is en ip adress NIET overeenkomt.
    Given Gebruiker gaat naar de website via een ip adres die niet in het ip addres lijst is.
    Then Typ de juiste gebruikersnaam in het gebruikersnaamvak
    And typ het juiste wachtwoord in het wachtwoordvak
    And klikt op de inlogknop
#    And typ juiste toegangscode Twilio kan hier gebruikt worden via sms te veriferen
    And klikt op de inlogknop
    And close driver