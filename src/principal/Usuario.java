/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
/**
 *
 * @author Mateus
 */
public class Usuario implements IElemento{
    private String nome;

    Usuario(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(IElemento obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return nome.equals(other.getNome());
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
}

//editado em 15:38
