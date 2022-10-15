var numero = parseFloat(prompt("Insira um número para somar ou -1 para encerrar"));
var soma = 0;
while(numero != -1){
    soma += numero;
    numero = parseFloat(prompt("Insira um número para somar ou -1 para encerrar"));
}
alert(soma);