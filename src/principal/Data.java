/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;

/**
 *
 * @author DiegoParra
 */
public class Data implements IElemento{
    private int dia, mes, ano;

    /*public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }*/
    
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
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    @Override
    public boolean equals(IElemento elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
