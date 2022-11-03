export default class Funcionario {

    constructor(cpf,nomeCompleto,salario){
        const regex = new RegExp ("^[0-9]{3}[\.][0-9]{3}[\.][0-9]{3}[-][0-9]{2}$")
        if(regex.test(cpf)){
            this.cpf = cpf
            this.nomeCompleto = nomeCompleto
            this.salario = salario 
        }else{
            console.log("CPF inválido, utilize: 000.000.000-00")
        }
    }
    promover(percentual){
        this.salario += (this.salario *(percentual/100))
    }
}
