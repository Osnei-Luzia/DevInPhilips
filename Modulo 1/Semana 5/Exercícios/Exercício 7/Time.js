export default class Time{
    constructor(nome,sigla,vitorias,empates,derrotas,golsMarcados,golsSofridos){
        this.nome = nome
        this.sigla = sigla
        this.vitorias = vitorias
        this.derrotas = derrotas
        this.empates = empates
        this.golsMarcados = golsMarcados
        this.golsSofridos = golsSofridos
    }
    get numeroDeJogos(){
        return this.derrotas + this.empates + this.vitorias
    }
    get numeroDePontos(){
        return this.vitorias*3+this.derrotas
    }
    computarPartida(partida){
        if(partida.siglaTimeA == this.sigla){
            if(partida.golsTimeA>partida.golsTimeB){
                this.vitorias++
            }else if(partida.golsTimeA<partida.golsTimeB){
                this.derrotas++
            }else{
                this.empates++
            }
            this.golsMarcados += partida.golsTimeA
            this.golsSofridos += partida.golsTimeB
        }else if(partida.siglaTimeB == this.sigla){
            if(partida.golsTimeB>partida.golsTimeA){
                this.vitorias++
            }else if(partida.golsTimeB<partida.golsTimeA){
                this.derrotas++
            }else{
                this.empates++
            }
            this.golsMarcados += partida.golsTimeB
            this.golsSofridos += partida.golsTimeA
        }
    }
    exibirSituacao(){
        console.log(this)
    }
}