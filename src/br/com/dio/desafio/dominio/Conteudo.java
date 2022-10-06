package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    private String titulo;
    private String descricao;
    protected final Double XP_PADRAO = 10d;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public abstract Double calcularXp();
}
