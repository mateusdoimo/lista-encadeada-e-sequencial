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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Lista lista;
	//mudar	o comando abaixo para lista = new ListaSequencial();
	//lista = new ListaEncadeada();
        lista = new ListaSequencial();
        lista.inserir(new Usuario("Marcelo"));
        lista.inserir(new Usuario("Joao"));
        lista.inserir(new Usuario("Pedro"));
	lista.inserir(new Usuario("Gustavo"));
	lista.inserir(new Usuario("Larissa"));
	lista.inserir(new Usuario("Flavia"));
	lista.imprimir();
	lista.remover(new Usuario("Gustavo"));
	lista.imprimir();
    }
}
