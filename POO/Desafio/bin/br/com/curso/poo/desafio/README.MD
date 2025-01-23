# Desafio

Este desafio consiste em desenvolver um sistema de software para gerenciar a biblioteca de uma instituição escolar. O sistema deve ser capaz de realizar a gestão de alunos, livros e empréstimos de forma eficiente, respeitando as restrições especificadas. Abaixo estão os requisitos detalhados do sistema:

Funcionalidades do Sistema

1. Gestão de Alunos

Funções: O sistema deve permitir inserir, editar, remover e listar alunos.
Dados Importantes:Matrícula (Única): Cada aluno deve ser identificado por um número de matrícula exclusivo.
Nome: Registro do nome completo do aluno.
Série: O nível ou série em que o aluno está matriculado.

2. Gestão de Livros

Funções: O sistema deve possibilitar inserir, editar, remover e listar os livros disponíveis na biblioteca.
Dados Importantes:Identificador (Único): Cada livro terá um identificador único que facilita seu rastreamento.
Título: Nome oficial do livro.
Autor: Nome do autor do livro.
Gênero: Categoria literária à qual o livro pertence.

3. Gestão de Empréstimos

Regras para Empréstimos:Cada livro pode ser emprestado a apenas um aluno por vez. Não são permitidos empréstimos múltiplos para o mesmo livro no mesmo período.
Cada aluno só pode ter um livro emprestado por vez. Isso impede que o mesmo aluno pegue múltiplos livros ao mesmo tempo.
O sistema deve evitar duplicações, garantindo que não exista mais de um aluno com a mesma matrícula e que não haja dois livros com o mesmo identificador.
Deve ser possível visualizar de forma clara e organizada todos os empréstimos atuais, possibilitando uma compreensão rápida do estado atual das transações de livros.

Considerações Finais

O desenvolvimento deste sistema requer habilidades na manipulação de dados, implementação de controles de exclusividade e um bom entendimento das operações de CRUD (Create, Read, Update, Delete). Estes componentes deverão ser integrados de modo a tornar o sistema intuitivo e funcional para os operadores da biblioteca. Ao finalizar, o sistema deverá ser testado com casos de uso práticos para garantir que todas as regras e funcionalidades sejam respeitadas.
