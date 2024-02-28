package controlador;
public class cls_asistencia {
    
    private int id_Int;
    private String fechaStr;
    private String horaStr;

    public cls_asistencia(int id_Int, String fechaStr, String horaStr) {
        this.id_Int = id_Int;
        this.fechaStr = fechaStr;
        this.horaStr = horaStr;
    }

    // Métodos Getters

    public int getId_Int() {
        return id_Int;
    }

    public String getFechaStr() {
        return fechaStr;
    }

    public String getHoraStr() {
        return horaStr;
    }

    // Métodos Setters

    public void setId_Int(int id_Int) {
        this.id_Int = id_Int;
    }

    public void setFechaStr(String fechaStr) {
        this.fechaStr = fechaStr;
    }

    public void setHoraStr(String horaStr) {
        this.horaStr = horaStr;
    }

}
