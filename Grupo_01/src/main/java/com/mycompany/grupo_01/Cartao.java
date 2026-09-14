package com.mycompany.grupo_01;

public class Cartao {
    private int id;
    private boolean ativo;
    
    public Cartao(int id){
        this.id = id;
        this.ativo = true;
    }
    
    public int getId() {
        return id;
    }
    
    public boolean isAtivo() {
        return ativo;
    }
    
    public void Bloquear() {
        ativo = false;
    }
}
