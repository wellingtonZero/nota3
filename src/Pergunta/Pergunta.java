package Pergunta;

/*
* Classe que vai representar uma pergunta no formulario
* @Autor Álvaro Antônio
* */

public class Pergunta {
    private String titulo;
    private boolean obrigatoria;

    public Pergunta(String titulo, boolean obrigatoria) {
        this.titulo = titulo;
        this.obrigatoria = obrigatoria;
    }

    public Pergunta() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isObrigatoria() {
        return obrigatoria;
    }

    public void setObrigatoria(boolean obrigatoria) {
        this.obrigatoria = obrigatoria;
    }
}
