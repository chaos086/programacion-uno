package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CentroBotanico centro = new CentroBotanico();

        // Crear plantas
        Planta planta1 = new Planta("Suculenta1", "Suculenta");
        Planta planta2 = new Planta("Arbol1", "Árbol");

        centro.agregarPlanta(planta1);
        centro.agregarPlanta(planta2);

        // Crear botánicos
        Botanico botanico1 = new Botanico(1, "Juan", "Pérez", "juan@email.com", "1234567890");
        Botanico botanico2 = new Botanico(2, "Ana", "García", "ana@email.com", "9876543210");

        centro.agregarBotanico(botanico1);
        centro.agregarBotanico(botanico2);

        // Programar un cuidado
        List<Planta> plantasCuidado = new ArrayList<>();
        plantasCuidado.add(planta1);
        List<Botanico> botanicosCuidado = new ArrayList<>();
        botanicosCuidado.add(botanico1);
        Cuidado cuidado1 = new Cuidado("Área1", "2023-10-25 10:00", plantasCuidado, botanicosCuidado);

        centro.programarCuidado(cuidado1);

        // Obtener cuidados de una planta
        List<Cuidado> cuidadosPlanta1 = centro.obtenerCuidadosDePlanta("Suculenta1");
        System.out.println("Cuidados de Suculenta1:");
        for (Cuidado cuidado : cuidadosPlanta1) {
            System.out.println("Fecha y Hora: " + cuidado.getFechaHora());
            System.out.println("Área: " + cuidado.getArea());
            System.out.println("Estado: " + cuidado.getEstado());
            System.out.println("Resultado de Salud: " + cuidado.getResultadoSalud());
            System.out.println("Resultado de Crecimiento: " + cuidado.getResultadoCrecimiento());
            System.out.println("---");
        }

        // Obtener cuidados de un botánico
        List<Cuidado> cuidadosBotanico1 = centro.obtenerCuidadosDeBotanico(1);
        System.out.println("Cuidados asignados a Juan:");
        for (Cuidado cuidado : cuidadosBotanico1) {
            System.out.println("Fecha y Hora: " + cuidado.getFechaHora());
            System.out.println("Área: " + cuidado.getArea());
            System.out.println("Estado: " + cuidado.getEstado());
            System.out.println("Resultado de Salud: " + cuidado.getResultadoSalud());
            System.out.println("Resultado de Crecimiento: " + cuidado.getResultadoCrecimiento());
            System.out.println("---");
        }

        // Obtener resumen de cuidados
        System.out.println("Resumen de Cuidados:");
        Map<String, Integer> resumen = centro.obtenerResumenCuidados();
        for (Map.Entry<String, Integer> entry : resumen.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}