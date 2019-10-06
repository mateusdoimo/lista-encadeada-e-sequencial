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
public class ListaSequencial extends Lista{
    private IElemento data[];
    private IElemento aux[];
    public int i;
    /**
     *
     * @param elem 
     */
    
    @Override
    public void inserir(IElemento elem){        
        int w = 0;
        
        if(data == null){
            data = new IElemento[1];
            i = 0;
            return;
        }
        
        if(i > 0){
            while(data[i] != null){ i++; } //i = tamanho do vetor
        }

        if(i == 0){
            data[i] = elem;
        } else {
            aux = new IElemento[i+2];
            for(w = 0; w < i; w++){
                aux[w] = data[w];
            }
            aux[i+1] = elem;
            data = new IElemento[i+2];
            for(w = 0; w <= i; w++){
                data[w] = aux[w];
            }
        }
    }
    @Override
    public void remover(IElemento elem){
        if(data == null){ return; }
        int j = 0;
        
        while(!data[j].equals(elem) && data[j] != null){ j++; }
        
        if(data[j].equals(elem)){
            while(j < i){
                data[j] = data[j+1];            
            }
        }
        data[i] = null;
    }
    @Override
    public void imprimir(){
        if(data == null){ return; }
        
        for(int j = 0; j < i; j++){
            System.out.print(data[j] + ", ,");
        }
        System.out.println("");
        return;
    }
    
}
