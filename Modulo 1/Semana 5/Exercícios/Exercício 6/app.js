import Juros from "./Juros.js";

const inputA = new Juros(10000,0.07,24)
console.log(inputA.calcularJurosSimples())
console.log(inputA.calcularJurosCompostos())

const inputB = new Juros(10000,0.15,10)
console.log(inputB.calcularJurosSimples())
console.log(inputB.calcularJurosCompostos())