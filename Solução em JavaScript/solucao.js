/*
 * Focando na restrição do problema, qual define que a sequência de números
 * marcados não pode conter dois números iguais consecutivos, meu raciocínio
 * central constituiu de progressivamente comparar os valores da sequência com
 * seu sucessor. Caso o resultado da comparação for falso, isto é, o número
 * sucessor difere do número anterior, o valor da sequência máxima é
 * incrementada e o resultado é apresentado ao finalizar a iteração na sequência.
*/

// Entrada de dados qual lê o arquivo stdin(standard input)
let input = require('fs').readFileSync('stdin', 'utf8');
let lines = input.split('\n');

// Array que armazenará a sequência de números
let sequenciaDeNumeros = [];

// Loop que adiciona a sequência ao array
for (let index = 1; index <= lines[0]; index++) {
  sequenciaDeNumeros.push(lines[index]);
}

// Função que recebe o array da sequência e retorna a sequência máxima
function sequenciaSecreta(sequencia) {
  let sequenciaMaxima = 0;
  for (let index in sequencia) {
    // Operador condicional ternário
    // Verifica se o valor atual iterado é igual ao seu sucessor
    sequencia[index] == sequencia[parseInt(index) + 1] ? '' : sequenciaMaxima++;
  }
  return sequenciaMaxima;
}

// Chamada da função
console.log(sequenciaSecreta(sequenciaDeNumeros));
