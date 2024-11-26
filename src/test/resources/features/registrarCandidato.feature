#language: es

Característica: Login


  Antecedentes: : Login exitoso
    Dado el usuario se encuentre en la pagina web
    Cuando el usuario ingrese las credenciales y de clic en boton enviar
    Entonces el usuario visualiza el mensaje de validacion

  @RegistrarCandidato
    Escenario: Registro de candidato exitoso
    Dado que el usuario haga clic en el boton reclutamiento
    Y el usuario valida que esta en el modulo reclutamiento
    Cuando usuario hace clic en boton agregar
    Y el usuario llene el formulario con los datos del candidato y hace clic en el boton guardar
    Entonces el usuario da clic en el boton lista corta y da clic en el boton guardar
    Y el usuario programa la entrevista con el candidato
    Y el usuario marca el candidato como aprobado
    Y el usuario se dirige a la seccion de registros encontrado
    Y el usuario valida que el candido tiene estado contratado

