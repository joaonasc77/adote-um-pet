# Adote-um-Pet

Sistema desenvolvido em Java para gerenciamento de animais disponíveis para adoção.

## Sobre o projeto

O sistema de adoção de animais é uma aplicação desenvolvida em Java com o objetivo de simular o gerenciamento de animais para adoção. Ele permite cadastrar e consultar animais, realizar adoções, gerenciar quais animais estão disponíveis e quais foram adotados e cadastrar os adotantes.

O projeto foi desenvolvido com foco no aprendizado e na aplicação prática dos principais conceitos do paradigma de Orientação a Objetos (POO) utilizando a linguagem Java.

## Funcionalidades

- Cadastro de animais
- Listagem de animais cadastrados
- Busca de animais pelo nome
- Realização de adoções
- Listagem de animais disponíveis para adoção
- Listagem de animais já adotados
- Cadastro de adotantes
- Listagem de adotantes

## Conceitos de Java utilizados

- Classes e objetos
- Encapsulamento
- Construtores
- Getters e setters
- Herança
- Sobrescrita de métodos (`@Override`)
- ArrayList
- Estruturas de repetição
- Estruturas condicionais
- Switch
- Scanner para entrada de dados

## Tecnologias utilizadas

- Java
- Visual Studio Code
- Git e GitHub

## Estrutura do projeto

O projeto foi dividido em algumas classes, cada uma com uma responsabilidade específica:

- `Animal.java` — classe base (superclasse) que representa um animal e contém seus principais atributos e comportamento
- `Cachorro.java` — classe que herda de `Animal` e adiciona características específicas dos cachorros
- `Gato.java` — classe que herda de `Animal` e adiciona características específicas dos gatos
- `Adotante.java` — representa a pessoa responsável pela adoção de um animal
- `Menu.java` — responsável pelo menu do sistema e pelas operações realizadas pelo usuário
- `Main.java` — classe responsável por iniciar a aplicação

## Possíveis melhorias

- Permitir editar os dados de um animal
- Permitir remover animais cadastrados
- Adicionar um banco de dados para persistência dos dados
- Melhorar a interface do sistema com uso de interface gráfica
