export default class Personagem {
    percentualHp = 100
    constructor(nome){
        this.nome = nome
    }
    sofrerDano(percentualDano){
        if(this.percentualHp - percentualDano<0){
            this.percentualHp = 0
        }else{
            this.percentualHp -= percentualDano
        }
    }
    usarKitMedico(){
        if(this.percentualHp + 10>100){
            this.percentualHp = 100
        }else{
            this.percentualHp += 10
        }
    }
}