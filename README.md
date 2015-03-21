# SorteDoDia
programa em java que revela sua sorte diaria

Pequeno soft em java como trabalho de conclusao do modo de programação 2 do curso de jogos digitais da Faculdade Ipiranga.

Os eventos do soft permitem com a entrada do nome e o signo uma visualização de uma frase que cosrresponde com uma sorte 

As decisões de projeto que foram tomadas para que outros programadores não fujam do padão são: 

Criamos uma super classe chamada signo, fazendo com que ela tenha um construtor para que as sub classes que seriam os signos Ex: Aquario, Touros podessem implementar suas frases de maneira mais personalizadas sendo assim possível fazer com que as pessoas aqual  fossem acessar só o necessário. Instânciando as frases correspondentes ao signo, assim tornando o programa seja entendido de maneira facilmente  rápida e sem necessariamente consumir todos os recursos com as frases que tenha no Banco de Dados. 

Os testes são feitos da seguinte maneira: 

Os testes devem ser feitos em um computador que tenha os bancos de dados de uma  SQL e que tenha todas as classes implementadas, principalmente a que se reserva ao cliente . Os testes são gerados na classe main e devem ser geradas acresentando dois dados e verificando se na classe signo são atribuidos uma nova frase de registro. E tenha que se feito de forma que se informe os signos e se os daos foram gerados o nome do usuário mais a frase do dia  e também se a classe sorte pegou está frase e guardou no banco de dados da tabela sorte. 

Classe sorte:  

É responsável por receber um nome e um signo no qual tratara com o seguinte processo: pegara um nome e guardara na classe e o signo sofrera uma verificação dependendo da qual seja o signo. O processo criara um novo objeto relacionado ao signo do tipo Signo. A classe sorte possui mais um método que ficara responsável por pega a frase gerado do tipo objeto com retorno do tipo signo. 

Classe signo: 

Sendo a classe principal ficara responsável por fornecer a frase completa com o nome e a frase de sorte com o seguinte processo: será criada uma Classe abstrata que usará usada para construção das subclasse signos. O método construtor será usado para organizar e tornar a subclase em um estado valido. O nome será passado como parâmetro e o nome do usuário para se armazenado no sistema. Então o método frase será responsável por adiciona as listas de frases correspondentes a cada signo no arraylist frase. Sendo assim a variável índice será do tipo Random á qual será usada para selecionar a frase dentro do arraylist. A variável “frasedodia” será do tipo String que concatenarar o nome do usuário mais a frase sorteada pelo índice. O método “frase.get(int)” será responsável por pegar um item do array na qual é necessária um número inteiro que corresponda ao índice da frase desejada. O método “indice.nextInt(int)” será responsável por gera um número aleatório a qual será usado pelo método “frase.get” contudo para acontecer isto é necessário fornecer um intervalo entre zero e o número máximo. Portanto o método “frase.size” que retorna o total de elementos no arraylist frase que será usado pelo “indice.nextInt” para completar o processo para escolhe a frase aleatória dentro do arraylist. O método “public abstract void frases” 

 será usado por subclasses de Signos para adicionar frases de sorte nos Arraylist frase e “public String getFraseDoDia” ficarar responsável por fornecer a frase completa com o nome e a frase de sorte.

