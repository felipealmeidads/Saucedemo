#language: pt
#encoding: UTF-8
#date: 16-04-2020
#author: Felipe Almeida da Silva

Funcionalidade: Realizar o login no site
  Realizar o login no site da Saucedemo

	@startWeb @loginSaucedemo
	Cenario: Realizar meu login com sucesso

  	Dado que preencho os campos com login e senha validos
  	E clico no botao de 'LOGIN'
  	Entao visualizo a pagina de "Products"