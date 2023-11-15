package co.edu.uniquindio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CentroBotanico {
    private List<Planta> plantas;
    private List<Botanico> botanicos;
    private List<Cuidado> cuidados;

    public CentroBotanico() {
        plantas = new ArrayList<>();
        botanicos = new ArrayList<>();
        cuidados = new ArrayList<>();
    }

    // Métodos para agregar plantas, botánicos y cuidados
    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void agregarBotanico(Botanico botanico) {
        botanicos.add(botanico);
    }

    public void programarCuidado(Cuidado cuidado) {
        cuidados.add(cuidado);
    }

    // Métodos para obtener información
    public List<Cuidado> obtenerCuidadosDePlanta(String nombrePlanta) {
        List<Cuidado> cuidadosDePlanta = new ArrayList<>();
        for (Cuidado cuidado : cuidados) {
            for (Planta planta : cuidado.getPlantas()) {
                if (planta.getNombre().equals(nombrePlanta)) {
                    cuidadosDePlanta.add(cuidado);
                    break;
                }
            }
        }
        return cuidadosDePlanta;
    }

    public List<Cuidado> obtenerCuidadosDeBotanico(int licenciaBotanico) {
        List<Cuidado> cuidadosDeBotanico = new ArrayList<>();
        for (Cuidado cuidado : cuidados) {
            for (Botanico botanico : cuidado.getBotanicos()) {
                if (botanico.getLicencia() == licenciaBotanico) {
                    cuidadosDeBotanico.add(cuidado);
                    break;
                }
            }
        }
        return cuidadosDeBotanico;
    }

    public Map<String, Integer> obtenerResumenCuidados() {
        Map<String, Integer> resumen = new HashMap<>();
        int cuidadosRealizados = 0;
        int cuidadosPendientes = 0;
        int cuidadosAplazados = 0;

        for (Cuidado cuidado : cuidados) {
            if (cuidado.getEstado() == Cuidado.Estado.FINALIZADO) {
                cuidadosRealizados++;
            } else if (cuidado.getEstado() == Cuidado.Estado.PENDIENTE) {
                cuidadosPendientes++;
            } else if (cuidado.getEstado() == Cuidado.Estado.APLAZADO) {
                cuidadosAplazados++;
            }
        }

        resumen.put("Realizados", cuidadosRealizados);
        resumen.put("Pendientes", cuidadosPendientes);
        resumen.put("Aplazados", cuidadosAplazados);

        return resumen;
    }
}