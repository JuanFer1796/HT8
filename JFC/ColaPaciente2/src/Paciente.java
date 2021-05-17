/**
 * @author Juan Fernando Ramirez
 * carne: 20666
 * Clase paciente
 */
public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintoma;
    private String codigoEmergencia;

    public Paciente(String nombre, String sintoma, String codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    @Override
    public int compareTo(Paciente o) {
        return codigoEmergencia.compareTo(o.getCodigoEmergencia());
    }
    /*
    public int cambiarLetras(String codigoEmergencia){
        int numeroPrioridad = 0;
        switch(codigoEmergencia){
            case "A":
                numeroPrioridad = 5;
                break;
            case "B":
                numeroPrioridad = 4;
                break;
            case "C":
                numeroPrioridad = 3;
                break;
            case "D":
                numeroPrioridad = 2;
                break;
            case "E":
                numeroPrioridad = 1;
                break;
            default:
                numeroPrioridad=0;
        }
        return numeroPrioridad;
    }
*/

    /**
     *
     * @param nombre nombre del paciente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param sintoma del paciente
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     *
     * @param codigoEmergencia del paciente
     */
    public void setCodigoEmergencia(String codigoEmergencia) {
        this.codigoEmergencia = codigoEmergencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public String getCodigoEmergencia() {
        return codigoEmergencia;
    }

    @Override
    public String toString() {
        return "Paciente: " +
                "nombre='" + nombre + '\'' +
                ", sintoma='" + sintoma + '\'' +
                ", codigoEmergencia='" + codigoEmergencia+ "\n";
    }
}
