package controlador;
public class cls_notas {

    private int Idint;
    private  String Fechastr;
    private float notaflt;
    private String asignaturastr;
    private String observacionstr;
    public cls_notas(int idint, String fechastr, float notaflt, String asignaturastr, String observacionstr) {
        Idint = idint;
        Fechastr = fechastr;
        this.notaflt = notaflt;
        this.asignaturastr = asignaturastr;
        this.observacionstr = observacionstr;
    }
    public int getIdint() {
        return Idint;
    }
    public String getFechastr() {
        return Fechastr;
    }
    public float getNotaflt() {
        return notaflt;
    }
    public String getAsignaturastr() {
        return asignaturastr;
    }
    public String getObservacionstr() {
        return observacionstr;
    }
    public void setIdint(int idint) {
        Idint = idint;
    }
    public void setFechastr(String fechastr) {
        Fechastr = fechastr;
    }
    public void setNotaflt(float notaflt) {
        this.notaflt = notaflt;
    }
    public void setAsignaturastr(String asignaturastr) {
        this.asignaturastr = asignaturastr;
    }
    public void setObservacionstr(String observacionstr) {
        this.observacionstr = observacionstr;
    }

    
}