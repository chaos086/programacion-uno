package co.edu.uniquindio;

import java.util.List;

public class Cuidado {
    public enum Estado {
        PENDIENTE, EN_PROCESO, FINALIZADO, APLAZADO
    }

    private String area;
    private String fechaHora;
    private List<Planta> plantas;
    private List<Botanico> botanicos;
    private Estado estado;
    private String resultadoSalud;
    private String resultadoCrecimiento;

    // Constructor original
    public Cuidado(String area, String fechaHora, List<Planta> plantas, List<Botanico> botanicos) {
        this.area = area;
        this.fechaHora = fechaHora;
        this.plantas = plantas;
        this.botanicos = botanicos;
        this.estado = Estado.PENDIENTE;
    }

    // Métodos para cambiar el estado y registrar el resultado
    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void registrarResultado(String resultadoSalud, String resultadoCrecimiento) {
        this.resultadoSalud = resultadoSalud;
        this.resultadoCrecimiento = resultadoCrecimiento;
        this.estado = Estado.FINALIZADO;
    }

    // Getters
    public String getArea() {
        return area;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Estado getEstado() {
        return estado;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public List<Botanico> getBotanicos() {
        return botanicos;
    }

    public String getResultadoSalud() {
        return resultadoSalud;
    }

    public String getResultadoCrecimiento() {
        return resultadoCrecimiento;
    }
}