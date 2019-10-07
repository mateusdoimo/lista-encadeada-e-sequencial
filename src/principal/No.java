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
public class No {
    private IElemento elemento;
    private No next;

    public No(IElemento elemento) {
        this.elemento = elemento;
        this.next = null;
    }

    
    public IElemento getElemento() {
        return elemento;
    }

    public void setElemento(IElemento elemento) {
        this.elemento = elemento;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
    
}
