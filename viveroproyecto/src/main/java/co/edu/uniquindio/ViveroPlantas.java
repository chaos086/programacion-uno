package co.edu.uniquindio;

public class ViveroPlantas{
    private String nombreTienda, datoDireccion;
    private int numeroTienda;

    ViveroPlantas(String nombreTienda, String datoDireccion, int numeroTienda){
        this.nombreTienda = nombreTienda;
        this.datoDireccion = datoDireccion;
        this.numeroTienda = numeroTienda;

    }

    public String getNombre(){
        return nombreTienda;
    }

    public String getDireccion(){
        return datoDireccion;
    }

    public int getNumero(){
        return numeroTienda;
    }

    public void setNombre(String nombre){
        this.nombreTienda = nombre;
    }

    public void setDireccion(String direccion){
        this.datoDireccion = direccion;
    }

    public void setNumero(int numero){
        this.numeroTienda = numero;
    }

}

class Empleados{
    private String nombreEmpleado, cargoEmpleado;
    private int codigoEmpleado;

    Empleados(String nombreEmpleado, String cargoEmpleado, int codigoEmpleado){
        this.nombreEmpleado = nombreEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre(){
        return nombreEmpleado;
    }

    public String getCargo(){
        return cargoEmpleado;
    }

    public int getCodigo(){
        return codigoEmpleado;
    }

    public void setNombre(String nombre){
        this.nombreEmpleado = nombre;
    }

    public void setCargo(String cargo){
        this.cargoEmpleado = cargo;
    }

    public void setCodigo(int codigo){
        this.codigoEmpleado = codigo;
    }

}

class RegistroPlanta{
    private String nombreComun, nombreCientifico, tipoPlanta, cuidados;
    private int alto, ancho;

    RegistroPlanta(String nombreComun, String nombreCientifico, String tipoPlanta, String cuidados, int alto, int ancho){
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipoPlanta = tipoPlanta;
        this.cuidados = cuidados;
        this.alto = alto;
        this.ancho = ancho;
    }

    public String getNombreComun(){
        return nombreComun;
    }

    public String getNombreCientifico(){
        return nombreCientifico;
    }

    public String getTipoPlanta(){
        return tipoPlanta;
    }

    public String getCuidados(){
        return cuidados;
    }

    public int getAlto(){
        return alto;
    }

    public int getAncho(){
        return ancho;
    }

    public void setNombreComun(String nombreComun){
        this.nombreComun = nombreComun;
    }

    public void setNombreCientifico(String nombreCientifico){
        this.nombreCientifico = nombreCientifico;
    }

    public void setTipoPlanta(String tipoPlanta){
        this.tipoPlanta = tipoPlanta;
    }

    public void setCuidados(String cuidados){
        this.cuidados = cuidados;
    }

    public void setAlto(int alto){
        this.alto = alto;
    }

    public void setAncho(int ancho){
        this.ancho = ancho;
    }

}

class BitacoraCuidados{
    private String fechaRiego, fechaAbonado, fechaTrasplante, eventoRelevante;
    
    BitacoraCuidados(String fechaRiego, String fechaAbonado, String fechaTrasplante, String eventoRelevante){
        this.fechaRiego = fechaRiego;
        this.fechaAbonado = fechaAbonado;
        this.fechaTrasplante = fechaTrasplante;
        this.eventoRelevante = eventoRelevante;
    }

    public String getFechaRiego(){
        return fechaRiego;
    }

    public String getFechaAbonado(){
        return fechaAbonado;
    }

    public String getFechaTrasplante(){
        return fechaTrasplante;
    }

    public String getEventoRelevante(){
        return eventoRelevante;
    }

    public void setFechaRiego(String fechaRiego){
        this.fechaRiego = fechaRiego;
    }

    public void setFechaAbonado(String fechaAbonado){
        this.fechaAbonado = fechaAbonado;
    }

    public void setFechaTrasplante(String fechaTrasplante){
        this.fechaTrasplante = fechaTrasplante;
    }

    public void setEventoRelevante(String eventoRelevante){
        this.eventoRelevante = eventoRelevante;
    }

}

class RegistroCliente{
    private String nombreCliente, genero, direccion;
    private int identificacion, telefono;

    RegistroCliente(String nombreCliente, String genero, String direccion, int identificacion, int telefono){
        this.nombreCliente = nombreCliente;
        this.genero = genero;
        this.direccion = direccion;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public String getGenero(){
        return genero;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getIdentificacion(){
        return identificacion;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

}

class SeguimientoCliente{
    private String interesCliente, plantasAdquiridas, sugerenciaPlantas, recordatorioCuidado;
    private int cantidadAdquiridas;

    SeguimientoCliente(String interesCliente, String plantasAdquiridas, String sugerenciaPlantas, String recordatorioCuidado, int cantidadAdquiridas){
        this.interesCliente = interesCliente;
        this.plantasAdquiridas = plantasAdquiridas;
        this.cantidadAdquiridas = cantidadAdquiridas;
        this.sugerenciaPlantas = sugerenciaPlantas;
        this.recordatorioCuidado = recordatorioCuidado;
    }

    public String getInteresCliente(){
        return interesCliente;
    }

    public String getPlantasAdquiridas(){
        return plantasAdquiridas;
    }

    public String getSugerenciaPlantas(){
        return sugerenciaPlantas;
    }

    public String getRecordatorioCuidado(){
        return recordatorioCuidado;
    }

    public int getCantidadAdquiridas(){
        return cantidadAdquiridas;
    }

    public void setInteresCliente(String interesCliente){
        this.interesCliente = interesCliente;
    }

    public void setPlantasAdquiridas(String plantasAdquiridas){
        this.plantasAdquiridas = plantasAdquiridas;
    }

    public void setSugerenciaPlantas(String sugerenciaPlantas){
        this.sugerenciaPlantas = sugerenciaPlantas;
    }

    public void setRecordatorioCuidado(String recordatorioCuidado){
        this.recordatorioCuidado = recordatorioCuidado;
    }

    public void setCantidadAdquiridas(int cantidadAdquiridas){
        this.cantidadAdquiridas = cantidadAdquiridas;
    }

}

class Forum{
    private String preguntas, respuestas, consejos;

    Forum(String preguntas, String respuestas, String consejos){
        this.preguntas = preguntas;
        this.respuestas = respuestas;
        this.consejos = consejos;
    }

    public String getPreguntas(){
        return preguntas;
    }

    public String getRespuestas(){
        return respuestas;
    }

    public String getConsejos(){
        return consejos;
    }

    public void setPreguntas(String preguntas){
        this.preguntas = preguntas;
    }

    public void setRespuestas(String respuestas){
        this.respuestas = respuestas;
    }

    public void setConsejos(String consejos){
        this.consejos = consejos;
    }

}

class Buscador{
    private String busqueda;

    Buscador(String busqueda){
        this.busqueda = busqueda;
    }

    public String getBusqueda(){
        return busqueda;
    }

    public void setBusqueda(String busqueda){
        this.busqueda = busqueda;
    }

}