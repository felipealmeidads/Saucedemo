#language: pt
#encoding: UTF-8
#date: 27-04-2020
#author: Felipe Almeida da Silva

Funcionalidade: Adicionar produtos no carrinho
  Adicionar os produtos da Saucedemo no carrinho

  @startWeb @produtosSaucedemo
  Cenario: Adicionar os produtos com sucesso
    Dado que realizo o login no sistema
    E adiciono o primeiro produto visivel
    E filtro os produto mais caros
    E adiciono o primeiro produto da lsita
    Quando clico no carrinho de compras
    Entao visualizo "Your Cart"
