package Aula05.service;

public class ServicoDownload implements Download{
    @Override
    public void baixar(int id, String tipo) {
        System.out.println("Usuário(a): " + id + " " + tipo +".\nDownload realizado com sucesso.");
    }
}
