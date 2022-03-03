package Aula06;

import Aula06.SerieNaoHabilitadaException;

public class SerieProxy implements ISerie{

    private int qtdViews;

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {

        qtdViews++;
        contar();
        Serie serie = new Serie();
        return serie.getSerie(nome);
    }

    public void contar() throws SerieNaoHabilitadaException{
        if (qtdViews > 5){
            throw new SerieNaoHabilitadaException("Você atingiu o máximo de transmissões");
        }
    }
}
