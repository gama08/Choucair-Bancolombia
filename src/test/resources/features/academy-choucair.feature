@historia
  Feature: Academia Choucair
    Como usuario, quiero aprender a automatizar en Screemplay en la academia Choucair con el curso de automatización
  Scenario: Buscar curso automatización
    Given que Antonio quiere aprender automatizacion en la academia Choucair
    | strUsuario | strContrasenia |
    | 1010040480 | Choucair2021*  |
    When busca el curso en la plataforma de la academia Choucair
    | strCurso                    |
    | recursos automatizacion Bancolombia |
    #Then encuentra el curso denominado recursos automatizacion Bancolombia
    Then encuentra el curso denominado
    | strCurso                    |
    | Patrones de Automatización |