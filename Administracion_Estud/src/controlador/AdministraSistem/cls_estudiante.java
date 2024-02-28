Package controlador;
public class cls_estudiante {

    private int id_Int;
    private String nombresStr;
    private String contactoStr;
    private String cursosStr;
    private String correoStr;
    private String sexoStr;

    public cls_estudiante(int id_Int, String nombresStr, String contactoStr, String cursosStr, String correoStr, String sexoStr) {
        this.id_Int = id_Int;
        this.nombresStr = nombresStr;
        this.contactoStr = contactoStr;
        this.cursosStr = cursosStr;
        this.correoStr = correoStr;
        this.sexoStr = sexoStr;
    }

    // Métodos Getters
    
    public int getId_Int() {
        return id_Int;
    }

    public String getNombresStr() {
        return nombresStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public String getCursosStr() {
        return cursosStr;
    }

    public String getCorreoStr() {
        return correoStr;
    }

    public String getSexoStr() {
        return sexoStr;
    }

    // Métodos Getters

    public void setId_Int(int id_Int) {
        this.id_Int = id_Int;
    }

    public void setNombresStr(String nombresStr) {
        this.nombresStr = nombresStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    public void setCursosStr(String cursosStr) {
        this.cursosStr = cursosStr;
    }

    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }

    public void setSexoStr(String sexoStr) {
        this.sexoStr = sexoStr;
    }
        
}
