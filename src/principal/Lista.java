/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/*

Aula Prática 2 - SCC0604 – Programação Orientada a Objetos

Alunos:
Diego da Silva Parra - 10716550
Mateus Fernandes Doimo - 10691971

*/
public abstract class Lista implements Imprimivel{
    protected int tamanho;
    
    public int tamanho(){
        return this.tamanho;
    } 
    
    public abstract void inserir(IElemento elem);
    
    public abstract void remover(IElemento elem);
    
}
