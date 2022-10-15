function idadeCheck(){
    let idade = parseFloat(prompt("Insira sua Idade"));
    if(!isNaN(idade)&&idade>0){
        if(idade<16){
            alert("Jovem");
        }else if(idade<65){
            alert("Adulto");
        }else{
            alert("Idoso");
        }
    }else{
        alert("Favor inserir idade válida")
        idadeCheck();
    }
}

idadeCheck();
