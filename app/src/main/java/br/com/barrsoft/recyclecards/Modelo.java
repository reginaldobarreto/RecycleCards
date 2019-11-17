package br.com.barrsoft.recyclecards;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

class Modelo {

    private String title;
    private String subTitle;
    private String descricao;
    private Drawable drawable;

    public Modelo(String title, String subTitle, String descricao, Drawable drawable) {
        this.title = title;
        this.subTitle = subTitle;
        this.descricao = descricao;
        this.drawable = drawable;
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

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
