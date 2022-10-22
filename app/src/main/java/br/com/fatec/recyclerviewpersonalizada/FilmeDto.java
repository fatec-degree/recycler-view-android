package br.com.fatec.recyclerviewpersonalizada;

public class FilmeDto {
    private String titulo;
    private String ano;
    private String genero;
    private String nota;
    private int imagem;

    public FilmeDto(String titulo, String ano, String genero, String nota, int imagem) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.nota = nota;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
