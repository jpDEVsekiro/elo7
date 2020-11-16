package com.example.elo7;

public class produto {
    private String nome,preço_anterios,preço,parcelas,picture,id, _link;

    public produto() {
    }

    public produto(String nome, String preço_anterios, String preço, String parcelas,String picture,String id,String _link) {
        this.nome = nome;
        this.preço_anterios = preço_anterios;
        this.preço = preço;
        this.picture = picture;
        this.parcelas=parcelas;
        this.id = id;
        this._link = _link;
    }

    public String getNome() {
        return nome;
    }

    public String getPreço_anterios() {
        return preço_anterios;
    }

    public String getPreço() {
        return preço;
    }

    public String getParcelas() {
        return parcelas;
    }
    public String getPicture() {
        return picture;
    }
    public String getId() {
        return id;
    }
    public String get_link() {
        return _link;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço_anterios(String preço_anterios) {
        this.preço_anterios = preço_anterios;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }
    public void picture(String picture) {
        this.picture = picture;
    }
    public void id(String id) {
        this.id = id;
    }
    public void _link(String _link) {
        this._link = _link;
    }


}
