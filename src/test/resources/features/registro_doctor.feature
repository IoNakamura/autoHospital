#language:es
Característica:
  yo como administrador del hospital
  deseo registrar un doctor al sistema
  para ver un doctor en el sistema

  Esquema del escenario: Registrar un doctor en el sistema de administracion del hospital
    Dado que Christian esta en la pagina del hospital
    Cuando el intenta registrar el doctor
      | Nombre   | Apellido   | Telefono   | documentoID   |
      | <Nombre> | <Apellido> | <Telefono> | <documentoID> |
    Entonces el vera el mensaje Datos guardados correctamente.

    Ejemplos:
      | Nombre | Apellido | Telefono | documentoID |
      | camilo | mestra   | 783897   | 611111      |
