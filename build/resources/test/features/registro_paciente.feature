#language:es
  Característica:
    yo como administrador del hospital
    deseo registrar un doctor al sistema
    para ver un doctor en el sistema

  Esquema del escenario: Registrar un paciente en el sistema de administracion del hospital
    Dado que Christian esta en la pagina del hospital
    Cuando el intenta registrar el paciente
      | Nombre   | Apellido   | Telefono   | documentoID   |
      | <Nombre> | <Apellido> | <Telefono> | <documentoID> |
    Entonces el vera el mensaje Datos guardados correctamente.
    Ejemplos:
      | Nombre | Apellido | Telefono | documentoID |
      | Juana | Gardeli   | 783397   | 611112      |