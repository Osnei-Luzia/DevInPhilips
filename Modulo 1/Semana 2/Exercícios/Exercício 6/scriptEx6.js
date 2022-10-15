function calc(){   
    let operacao = prompt(`Qual cálculo deseja realizar?\nSoma "+", Subtração "-", Multiplicação "*", Divisão "/"`);
    let num1 = parseFloat(prompt(`Digite o primeiro valor`));
    let num2 = parseFloat(prompt(`Digite o segundo valor`));

    if(!isNaN(num1)&&!isNaN(num2)){
        switch(operacao){
            case "+":
                alert(`O resultado do seu cálculo é: ${num1+num2}`)    
            break;
            case "-":    
                alert(`O resultado do seu cálculo é: ${num1-num2}`)           
            break;
            case "*":    
                alert(`O resultado do seu cálculo é: ${num1*num2}`)    
            break;
            case "/":    
                alert(`O resultado do seu cálculo é: ${num1/num2}`)           
            break;
            default:
                alert("Informe um operador válido.")
        }
    }else{
        alert("Favor inserir em valores válidos");
        calc();
    }
}
calc()