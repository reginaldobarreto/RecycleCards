package br.com.barrsoft.recyclecards;

import android.widget.ImageView;

class Modelo {

    private String title;
    private String subTitle;
    private String descricao;
    private ImageView imagem;

    public Modelo(String title, String subTitle, String descricao, ImageView imagem) {
        this.title = title;
        this.subTitle = subTitle;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }
}
