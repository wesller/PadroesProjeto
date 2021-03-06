# Padrões de Projeto


Resolvi disponibilizar o material que utilizei para revisar meu aprendizado sobre padrões de projeto, espero que a minha visão sobre o assunto possa ser util a todos que precisam aprender ou relembrar o assunto.

Os exemplos são criados por mim, mas o conteúdo teórico foi copiado da wikipedia

Cada padrão esta implementado em um pacote e a execução de todos esta na classe Prin

>## 1 - Facade
> - **Motivação**
>> - Estruturar um sistema em subsistemas ajuda a reduzir sua complexidade. A dependência existente entre os subsistemas pode ser minimizada através do uso de um objeto Façade, que fornece uma interface única e uniforme para as diversas funcionalidades de um subsistema. 
>>
>> - Quando existir um sistema complexo, na qual o cliente não precisa entender todo o sistema, o Façade possibilita um uso simplificado do sistema, apenas um subconjunto dele, ou utilizá-lo de uma maneira particular. Dispomos então de um sistema complicado, do qual precisamos utilizar somente uma parte, para um sistema simplificado, customizado para nossas necessidades.
> 
> - **Forças / Fraquezas**
>> - Torna o sistema mais fácil de se usar, protegendo os clientes dos componentes do sistema, reduzindo o número de objetos que terão que lidar.
>> - Promove fraco acoplamento entre os subsistemas e seus clientes.
>> - Não evita que as aplicações possam acessar as subclasses diretamente, pode-se escolher entre a facilidade de uso ou a generalidade.
> - **Categoria**
>> - Estruturais
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Fa%C3%A7ade

>## 2 - Singleton
> - **Motivação**
>> - Quando você necessita de somente uma instância da classe, por exemplo, a conexão com banco de dados, vamos supor que você terá que chamar diversas vezes a conexão com o banco de dados em um código na mesma execução, se você instanciar toda vez a classe de banco, haverá grande perda de desempenho, assim usando o padrão singleton, é garantida que nesta execução será instânciada a classe somente uma vez. Lembrando que este pattern é considerado por muitos desenvolvedores um antipattern, então, cuidado onde for utilizá-lo.
> 
> - **Forças / Fraquezas**
>> - Permite o controle sobre como e quando os clientes acessam a instância.
>> - Várias classes singleton podem obedecer uma mesma interface, permitindo assim que um singleton em particular seja escolhido para trabalhar com uma determinada aplicação em tempo de execução.
>> - Com apenas uma implementação interna do singleton pode-se fazer com que o singleton crie um número controlado de instâncias.
>> - É mais flexível que métodos estáticos por permitir o polimorfismo.
>> - Acoplamento: Usando Singleton você estará acoplando o seu código em uma implementação estática e específica. 
>> - Isso faz o seu código dependente dessa classe e impede, por exemplo, criar mocks em testes unitários.
>> - Escopo: Se você por alguma razão decidir que para determinado componente da aplicação você precisa de outra implementação terá que alterar manualmente todas as classes.
>> - Falsa segurança: No java, por exemplo, não existe uma classe apenas por JVM. O conceito de carregamento de classes em java é feito por ClassLoader.
> - **Categoria**
>> - Criação
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Singleton

>## 3 - Mediator
> - **Motivação**
>> - É um padrão de projeto usado frequentemente quando deseja-se encapsular como os objetos interagem, ou seja, a comunicação entre os objetos é estabelecida através do Mediator. Este padrão é considerado um padrão comportamental, pois o padrão pode alterar o comportamento da aplicação (programa).O Mediator promove o fraco acoplamento ao evitar que objetos se referiram uns aos outros explicitamente.
> 
> - **Forças / Fraquezas**
>> - Diminuí consideravelmente o acoplamento (entre os Colegas) e consequentemente aumenta o reuso.
>> - Ocorre a eliminação de relacionamentos muitos para muitos (N para N)
>> - A política de comunicações fica centralizada no Mediator, logo, podemos alterar essa política sem precisar alterar os Colegas.
>> - Em termos práticos a tendência do padrão Mediator é tornar-se complexo.A troca de complexidade, inicialmente na interação e, após a aplicação do padrão, a complexidade passa a ficar no Mediator o que dificulta a manutenção.
> - **Categoria**
>> - Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Mediator

>## 4 - Iterator
> - **Motivação**
>> - Um iterador externo pode ser imaginado como um tipo de ponteiro que possui duas operações primárias: referenciar um elemento particular na coleção de objetos (chamado elemento de acesso) e modificar a si mesmo para apontar para o próximo elemento (chamado elemento de travessia). Também deve existir uma maneira de criar um iterador para apontar para algum primeiro elemento bem como alguma maneira de determinar quando o iterador esgotou todos os elementos no container. Dependendo da linguagem e do uso pretendido, iteradores podem também fornecer operações adicionais ou exibir comportamentos diferentes.
>> - O propósito primário de um iterador é permitir que um usuário processe cada elemento de um container enquanto isola o usuário da estrutura interna de um container. Isto permite que o container armazene elementos da maneira que ele desejar permitindo que o usuário trate-o como se ele fosse uma simples lista ou sequencia. Uma classe iterador normalmente é projetada em estreita coordenação com a classe container correspondente. Normalmente, o container fornece os métodos para criação de iteradores.
>> - Observe que um contador de loop algumas vezes é referenciado como um iterador de loop. Um contador de loop, entretanto, apenas fornece a funcionalidade de travessia e não a funcionalidade de acesso ao elemento.
> 
> - **Forças / Fraquezas**
>> - Suporta variações no percurso
>> - Iteradores simplificam a interface do objeto a ser iterado
>> - Pode haver mais de percurso sendo percorrido ao mesmo tempo (concorrência)
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Iterador

>## 5 - Strategy
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Strategy

>>## 6 - Command
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Command

>>## 7 - Builder
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Criação
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Builder

>>## 8 - State
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/State

>>## 9 - Template Method
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Template_Method

>>## 10 - Factory Method
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Criação
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Factory_Method

>>## 11- Memento
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Memento_(inform%C3%A1tica)

>>## 12 - Prototype
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Criação
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Prototype

>>## 13 - Proxy
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Estrutural
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Proxy_(padr%C3%B5es_de_projeto)

>>## 14 - Decorator
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Estrutural
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Decorator

>>## 15 - Adapter
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Estrutural
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Adapter

>>## 16 - Bridge
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Estrutural
> - **Fonte**
>> - https://pt.wikipedia.org/w/index.php?title=Bridge_(padr%C3%A3o_de_projeto_Estrutural)&action=edit&redlink=1

>>## 17 - Observer
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Observer

>>## 18 - Composite
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Estrutural
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Composite

>>## 19 - Interpreter
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Interpreter

>>## 20 - Chain Of Responsibility
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Chain_of_Responsibility

>>## 21 - Abstract Factory
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Criação
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Abstract_Factory

>>## 22 - Visitor
> - **Motivação**
>> - 
> 
> - **Forças / Fraquezas**
>> - 
> - **Categoria**
>> -  Comportamental
> - **Fonte**
>> - https://pt.wikipedia.org/wiki/Visitor_pattern


# Bibliografia
## Padrões de projeto (GoF)