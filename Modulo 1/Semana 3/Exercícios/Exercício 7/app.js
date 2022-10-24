const pessoa = {
    nome: 'Ada',
    idade: 36,
    profissao: 'professora'
}

const desestruturador = ({nome,idade,profissao} = objeto) =>{
    return (`Esta pessoa se chama: ${nome}, tem ${idade} anos, sua profissão é: ${profissao}`)
}

console.log(desestruturador(pessoa));