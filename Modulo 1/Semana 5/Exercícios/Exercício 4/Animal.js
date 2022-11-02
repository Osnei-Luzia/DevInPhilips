export class Animal{
    nome
    idade
    som
}
export class Cachorro extends Animal{
    constructor(nome,idade){
        super()
        super.nome = nome
        super.idade = idade
        super.som = `latido`
    }
}
export class Gato extends Animal{
    constructor(nome,idade){
        super()
        super.nome = nome
        super.idade = idade
        super.som = `miado`
    }
}