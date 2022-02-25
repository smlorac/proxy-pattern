package Aula05.model;

import Aula05.service.Download;
import Aula05.service.ServicoDownload;
import Aula05.service.ServicoDownloadProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    public void testeBaixar(){
        Usuario u1 = new Usuario(123, "premium");
        Usuario u2 = new Usuario(456, "free");

        Download download = new ServicoDownloadProxy();

        download.baixar(u1.getIdentificador(), u1.getTipoUsuario());
        download.baixar(u2.getIdentificador(), u2.getTipoUsuario());
    }

}