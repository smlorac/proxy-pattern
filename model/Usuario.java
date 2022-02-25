package Aula05.model;

public class Usuario {

    private int identificador;
    private String tipoUsuario;

    public Usuario(int identificador, String tipoUsuario) {
        this.identificador = identificador;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
