/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;

/*

Aula Prática 2 - SCC0604 – Programação Orientada a Objetos

Alunos:
Diego da Silva Parra - 10716550
Mateus Fernandes Doimo - 10691971

*/
public class Data implements IElemento{
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano) throws IOException {
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12)
            throw new IOException("Dia ou mes inválidos!");
        
    }
    
    public void setData(int dia, int mes, int ano) throws IOException {
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12)
            throw new IOException("Dia ou mes inválidos!");
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public boolean data_bix(int yr){
        if (yr%4 == 0){
            if(yr%100 == 0){
                return yr%400 == 0;
            }
            else{ return true; }
        }
        else{ return false; }
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    @Override
    public boolean equals(IElemento elem) {
        Data aux = (Data)elem;
        return(aux.dia == dia && aux.mes == mes && aux.ano == ano);
    }
}
