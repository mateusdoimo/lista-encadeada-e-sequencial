# Lista encadeada e sequencial
<h3>Aula Prática 2 - SCC0604 – Programação Orientada a Objetos<br>Prof.	Marcelo	Manzato</h3>

**Alunos:**<br>
Diego da Silva Parra - 10716550<br>
Mateus Fernandes Doimo - 10691971<br>


**Questões:**

1. Quais são os métodos polimórficos do diagrama acima?<br>
Os métodos polimórficos são Inserir(IElemento elem), Remover(IElemento elem) e Imprimir() das classes Lista, Lista Sequencial e Lista Encadeada e equals() das classes Usuário e IElemento.

2. Por quê Lista foi	implementada como uma classe abstrata e Imprimivel foi definida como uma interface?<br>
Lista foi implementada como uma classe abstrata pois ela é um modelo para outras classes que dela herdem, como as classes Lista Sequencial e Lista Encadeada. Além disso, Imprimível foi definida como uma interface pois nem todos os tipos de lista (classe que dela herda) implementam o método imprimir.

3. Como	você poderia estender o diagrama acima	para permitir	que	sua	lista	armazene objetos de uma classe Data (contendo mês, dia e ano) Implemente.<br>
Inicialmente, seria criada a classe Data com seus métodos e atributos. Depois, seria implementada a interface IElemento.

4. Explique quais (se existir) relacionamentos são do tipo: generalização (herança e interface), associação,	agregação,	composição	e	dependência.<br>
Generalização:<br>
Imprimível e Lista; IElemento e Usuário; Lista e ListaSequencial/ListaEncadeada.<br>

Composição:<br>
ListaEncadeada e Nó<br>

Dependência:<br>
Principal e ListaEncadeada; ListaEncadeada/ListaSequencial e IElemento; ListaSequencial e Usuário<br>

<br>
Roteiro: https://ae4.tidia-ae.usp.br/access/content/group/ae9eb563-94f5-41e6-8e25-0d15e645281f/Aula%20Pra%CC%81tica%202.pdf
