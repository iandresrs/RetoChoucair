#language: es

Característica: Login

  @Login
  Escenario: Login exitoso
    Dado el usuario se encuentre en la pagina web
    Cuando el usuario ingrese las credenciales y de clic en boton enviar
    Entonces el usuario visualiza el mensaje de validacion
