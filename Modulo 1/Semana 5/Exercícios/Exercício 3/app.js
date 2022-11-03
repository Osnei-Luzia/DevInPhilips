import Personagem from "./Personagem.js"

const personagem = new Personagem("Nome")
console.log(personagem)
personagem.sofrerDano(5)
console.log(personagem.percentualHp)
personagem.usarKitMedico()
console.log(personagem.percentualHp)