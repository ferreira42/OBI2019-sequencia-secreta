# OBI2019-sequencia-secreta

## Sobre

O presente repositório contêm minha solução nas linguagens Java e Javascript (Node.js) para o problema [Sequência Secreta](https://olimpiada.ic.unicamp.br/pratique/pj/2019/f1/secreta/) apresentado na fase 1 da OBI2019.

## Minha solução

Focando na restrição do problema, qual define que a sequência de números marcados não pode conter dois números iguais consecutivos, meu raciocínio central constituiu de progressivamente comparar os valores da sequência com seu sucessor. Caso o resultado da comparação for falso, isto é, o número sucessor difere do número anterior, o valor da sequência máxima é incrementada e o resultado é apresentado ao finalizar a iteração na sequência.

## Testando a solução em JavaScript

Para executar o arquivo Javascript é necessário ter o [Node.js](https://nodejs.org) instalado na máquina. A pasta contém um arquivo stdin (standard input) no qual deve ser inserido as informações de entrada para o programa.

Na pasta do arquivo execute o comando em um terminal:

```javascript
node solucao.js
```

## Testando a solução em Java

Para executar o arquivo Java é necessário ter o [Java](https://www.java.com/pt-BR/download/manual.jsp) instalado na máquina.

Na pasta do arquivo execute o comando em um terminal:

```java
java solucao
```
