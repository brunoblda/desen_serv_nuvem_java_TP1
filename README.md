# Infnet - TP1 - Desenvolvimento de Serviços em Nuvem com Java
Teste de Performance 1 da matéria de Desenvolvimento de Serviços em Nuvem com Java

## Apresentação

Desenvolva um projeto simples com Spring Boot que implemente um microsserviço elementar de consulta que demonstre o entendimento da criação de um projeto simples nessa plataforma.

## Projeto Desenvolvido

O projeto foi desenvolvido por meio do Spring Boot, contendo os pacotes de controller, dominio e repository.

O sistema possui um conjunto de dados salvos no repository que sao modelados de acordo com o que foi definido no domínio e o controller realiza a chamada dos dados ou em sua totalidade ou de 1 item.

O nome do sistema é Contatos.

Foi criada a classe de Domínio "Contato" com os atributos:
 * id
 * nome
 * apelido
 * email
 * fone

A classe ContatoRepository armazena um grupo de 4 contatos salvos em um HashMap.

A classe ContatoController realiza a chamada dos dados no repository nas rotas http://localhost:8080/contatos e  http://localhost:8080/contatos/{id}



