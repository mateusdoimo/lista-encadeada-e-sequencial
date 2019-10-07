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
public class ListaSequencial extends Lista{
    private IElemento data[];
    /**
     * 
     * @param elem
     */
    
    @Override
    public void inserir(IElemento elem){        
        IElemento[] aux;
        int i, w;
        
        if(data == null){
            data = new IElemento[1];
            data[0] = elem;
            return;
        }
        
        i = data.length; //i = tamanho do vetor
        
        if(i > 0){
            aux = new IElemento[i+1];
            for(w = 0; w < i; w++){
                aux[w] = data[w];
            }
            aux[i] = elem;
            data = new IElemento[i+1];
            for(w = 0; w < (i+1); w++){
                data[w] = aux[w];
            }
        }        
        return;
    }
    
    @Override
    public void remover(IElemento elem){
        if(data == null){ return; }
        int i = 0;
        
        while(!(data[i].equals(elem)) && i < data.length){ i++; }
        
        if(data[i].equals(elem) && i < data.length){
            if(i == (data.length - 1)){
                data[i] = null;
                return;
            }
            while(i < data.length){
                if(i == data.length - 1){
                    data[i] = null;
                    break;
                }
                data[i] = data[i+1];     
                i++;
            }
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
    
    @Override
    public void imprimir(){
        if(data == null){ return; }
        
        for(int j = 0; j < data.length; j++){
            if(data[j] != null){
                System.out.print(data[j] + " ");
            }
        }
        System.out.println("");
        return;
    }
    
}
