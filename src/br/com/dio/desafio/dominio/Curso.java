package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private Double cargaHoraria;




    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }


    @Override
    public Double calcularXp() {

        return XP_PADRAO * cargaHoraria;
    }
}
