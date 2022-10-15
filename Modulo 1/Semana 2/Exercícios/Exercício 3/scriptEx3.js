function tabuada(){
    let numero = parseFloat(prompt("Insira um número"));
    if(!isNaN(numero)){
        let tabuada = "";
        for(cont=0;cont<11;cont++){
            tabuada += `${numero} x ${cont} = ${numero*cont}\n`;
        }
        alert(tabuada)
    }else{
        alert("Favor inserir em formato numérico")
        tabuada();
    }
}

tabuada();