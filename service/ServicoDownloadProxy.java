package Aula05.service;

public class ServicoDownloadProxy implements Download{

    @Override
    public void baixar(int id, String tipo) {
        if (tipo.equalsIgnoreCase("premium")){
            ServicoDownload sd = new ServicoDownload();
            sd.baixar(id, tipo);
        } else if (tipo.equalsIgnoreCase("free")){
            System.out.println("Usuário(a): " + id + " " + tipo + ".\nAtualiza sua conta para premium para realizar download de músicas");
        }
    }
}
