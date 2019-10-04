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
public class ListaEncadeada extends Lista{
    private No topo;
    private No aux;
    
    /**
     *
     * @param elem
     */
    @Override
    public void inserir(IElemento elem){
        No novo = new No();
        aux = topo;
        
        if(topo == null){
            topo = novo;
            topo.setNext(null);
            topo.setElemento(elem);
            return;
        }
        while(aux.getNext() != null){
            aux = aux.getNext();
        }
        novo.setElemento(elem);
        novo.setNext(null);
        aux.setNext(novo);
        
        return;
    }
    @Override
    public void remover(IElemento elem){
        if(topo == null){ return; }
        
    }
    
    @Override
    public void imprimir(){
        if(topo == null){ return; }
        aux = topo;
        while(aux.getNext() != null){
            System.out.println(aux.getElemento());
            aux = aux.getNext();
        }
        return;
    } 
    
}
