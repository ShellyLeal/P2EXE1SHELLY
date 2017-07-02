#Author: shellyleal.ita@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@analiseVenda
Feature: Analise das Funcionalidades da Loja

@bookSearch
Scenario: Book Search
Given Uma lista de livros
When Comprador faz uma busca
Then O comprador encontra o livro certo
			| name   | qnt  | price |
      | Livro1 |  1 |  5.4  | 
      | Livro2 |  5 |  12.6 | 
      | Livro3 |  8 |  6.5  | 