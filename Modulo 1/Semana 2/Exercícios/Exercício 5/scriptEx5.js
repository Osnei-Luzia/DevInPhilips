function contagemParImp(){
    let numero = parseFloat(prompt("Digite um número"));
    numero = Math.abs(numero);
    let par = 0;
    let impar = 0;
        if(!isNaN(numero)){
            par = Math.floor((numero/2)+1);
            impar = Math.ceil(numero/2);
        }else{
            alert("Favor inserir em formato numérico");
            contagemParImp();
        }
    alert(`Pares: ${par} \nImpar: ${impar}`)
    }

contagemParImp();