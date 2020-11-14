package co.com.hospital.certificacion.autoHospital.model;

public class DatosPaciente {

    private String nombre;
    private String apellido;
    private String telefono;
    private String documentoID;

    public DatosPaciente(String nombre, String apellido, String telefono, String documentoID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.documentoID = documentoID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDocumentoID() {
        return documentoID;
    }
}