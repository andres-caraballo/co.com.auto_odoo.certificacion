#language: es

 Característica: Logout de usuario exitoso
   yo como usuario deseo ingresar a la pagina Utest
   para validar la funcionalidad de cerrar sesion

   Escenario: Logout Exitoso
     Dado que Andres quiere abrir la pagina
     Cuando inicia sesion en el portal de odoo con usuario: automatizador y clave odoo16Automatizacion*
     Y el podra visualizar el mensaje de bienvenida
     Pero el cierra la sesion desde la sesion de usuario
     Entonces el podra visualizar la pantalla de inicio de sesion
