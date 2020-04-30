#language: pt
#encoding: UTF-8
#date: 28-04-2020
#author: Felipe Almeida da Silva
Funcionalidade: Finalizar a compra
  Finalizar a compra dos produtos adicionados

  @startWeb @compraSaucedemo
  Cenario: Finalizar a compra com sucesso
    Dado que adiciono um produto ao carrinho
    E acesso o carrinho
    E clico em 'CHECKOUT'
    E preencho as informacoes
    E clico em 'CONTINUE'
    Quando clico em 'FINISH'
    Entao exibe na tela "THANK YOU FOR YOUR ORDER"
