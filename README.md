# Sistema de Livraria Digital
Este é um sistema de gerenciamento de livros desenvolvido em Java. O projeto permite ao usuário adicionar, listar, buscar, remover e consultar livros disponíveis em estoque, simulando o funcionamento de uma livraria digital.

## Tecnologias Utilizadas
Java 8+
Scanner (para entrada do usuário)
Estrutura de pacotes em Java

## Estrutura do Projeto
O projeto está organizado da seguinte forma:

bash
Copiar código
LivrariaDigital/
├── src/
│   └── Livraria/
│       ├── main/
│       │   └── LivrariaMain.java      # Classe principal que executa o programa
│       ├── model/
│       │   └── Livro.java             # Classe que representa um livro
│       └── service/
│           └── LivrariaService.java   # Classe que contém a lógica de negócios da livraria
└── out/  (pasta gerada após a compilação)

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

Adicionar Livro:

Permite adicionar um novo livro com informações como título, autor, preço e quantidade em estoque.
Listar Livros:

Exibe todos os livros cadastrados na livraria.
Buscar Livro por Título:

Permite buscar livros através do título.
Remover Livro:

Permite remover um livro do estoque com base no título.
Sair:

Finaliza a execução do programa.

## Como Rodar o Projeto
### Usando a IDE (IntelliJ IDEA, Eclipse, NetBeans)

Abra o projeto na sua IDE preferida.
Compile e execute a classe LivrariaMain.java:
No IntelliJ IDEA: Clique com o botão direito em LivrariaMain.java e selecione Run 'LivrariaMain'.
No Eclipse: Clique com o botão direito em LivrariaMain.java e selecione Run As > Java Application.

### Rodando Manualmente no Terminal
Navegue até a pasta raiz do projeto (LivrariaDigital).

Compile os arquivos .java com o comando:

bash
Copiar código
javac -d out/ src/Livraria/main/LivrariaMain.java src/Livraria/model/Livro.java src/Livraria/service/LivrariaService.java
Execute o programa com o comando:

bash
Copiar código
java -cp out/ Livraria.main.LivrariaMain

## Estrutura de Classes

### LivrariaMain.java
Classe principal que contém o menu do sistema e interage com o usuário através do terminal, utilizando a classe LivrariaService para realizar as operações de adicionar, listar, buscar e remover livros.

Livro.java
Classe que representa um livro, contendo atributos como título, autor, preço e quantidade em estoque.

### LivrariaService.java
Classe responsável pela lógica de negócios da livraria, como adicionar, listar, buscar e remover livros do estoque.

Licença
Este projeto é de código aberto, licenciado sob a MIT License.

