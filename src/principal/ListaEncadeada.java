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
public class ListaEncadeada extends Lista{
    private No topo;
    private No aux;
    private No bef;
    
    /**
     *
     * @param elem
     */
    @Override
    public void inserir(IElemento elem){
        No novo = new No(elem);
        aux = topo;
        
        if(topo == null){
            topo = novo;
            return;
        }
        while(aux.getNext() != null){
            aux = aux.getNext();
        }
        aux.setNext(novo);
        
        return;
    }
    @Override
    public void remover(IElemento elem){        
        if(topo == null){ return; }
        while(topo == elem){
            topo = topo.getNext();
        }
        aux = topo;
        while(aux != null){
            bef = aux;
            aux = aux.getNext();
            if(aux.getElemento().equals(elem)){
                bef.setNext(aux.getNext());
            }
            aux = aux.getNext();
        }
        return;
    }
    
    @Override
    public void imprimir(){
        if(topo == null){ return; }
        aux = topo;
        while(aux != null){
            System.out.print(aux.getElemento() + " ");
            aux = aux.getNext();
        }
        System.out.println("");
        return;
    } 
    
}
