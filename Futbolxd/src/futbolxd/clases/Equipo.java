package futbolxd.clases;


public class Equipo {

    // Entrar Usuario 
    private int id, codigoEquipo, numeroRandom,Goles1,Goles2;
    private String contraseña, nombreEquipo, nombreEntrenador, nombreJugador,NomEquipo;
    private int año, dia, mes;

    public Equipo() {
    }

    public Equipo(int id, int codigoEquipo, int numeroRandom, int Goles1, int Goles2, String contraseña, String nombreEquipo,String NomEquipo, String nombreEntrenador, String nombreJugador, int año, int dia, int mes) {
        this.id = id;
        this.codigoEquipo = codigoEquipo;
        this.numeroRandom = numeroRandom;
        this.Goles1 = Goles1;
        this.Goles2 = Goles2;
        this.contraseña = contraseña;
        this.nombreEquipo = nombreEquipo;
        this.nombreEntrenador = nombreEntrenador;
        this.nombreJugador = nombreJugador;
        this.año = año;
        this.dia = dia;
        this.mes = mes;
        this.NomEquipo = NomEquipo;
    }

    public int getGoles1() {
        return Goles1;
    }

    public void setGoles1(int Goles1) {
        this.Goles1 = Goles1;
    }

    public int getGoles2() {
        return Goles2;
    }

    public void setGoles2(int Goles2) {
        this.Goles2 = Goles2;
    }

    public String getNomEquipo() {
        return NomEquipo;
    }

    public void setNomEquipo(String NomEquipo) {
        this.NomEquipo = NomEquipo;
    }
   
    
    public int getNumeroRandom() {
        return numeroRandom;
    }

    public void setNumeroRandom(int numeroRandom) {
        this.numeroRandom = numeroRandom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    

}
