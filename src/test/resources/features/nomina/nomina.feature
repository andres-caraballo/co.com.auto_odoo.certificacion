#language: es

 Característica: Login de usuario exitoso
   yo como usuario deseo ingresar a la pagina Utest
   para validar sus funcionalidades

   Escenario: Login Exitoso
     Dado que Andres quiere abrir la pagina
     Cuando inicia sesion en el portal de odoo con usuario: automatizador y clave odoo16Automatizacion*
     Entonces el podra visualizar el mensaje de bienvenida

   Escenario: Login fallido por credenciales incorrectas
     Dado que Andres quiere abrir la pagina
     Cuando inicia sesion en el portal de odoo con usuario: automatizador y clave Prueba123456789
     Entonces el podra visualizar un mensaje Usuario/contraseña incorrecta.