import CalculadoraDeArea from "./CalculadoraDeArea.js";

const figuraA = new CalculadoraDeArea("triangulo", 6, 8)
console.log(`Área da figura A é: ${figuraA.calcular()}`)

const figuraB = new CalculadoraDeArea("quadrado", 4, 4)
console.log(`Área da figura B é: ${figuraB.calcular()}`)

const figuraC = new CalculadoraDeArea("retangulo", 4, 6)
console.log(`Área da figura C é: ${figuraC.calcular()}`)