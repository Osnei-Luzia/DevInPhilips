function progressao(){
    const valor = parseFloat(prompt("Insira o valor inicial"));
    const raiz = parseFloat(prompt("Insira a raiz"));
    let pa = `${valor}`
    if(!isNaN(valor)&&!isNaN(raiz)){
        for(let cont=1;cont<10;cont++){
            pa += `, ${valor+(raiz*cont)}`
        }
        alert(`Valor inicial = ${valor}; Raiz = ${raiz}; P.A = ${pa}`)
    }else{
        alert("Favor inserir valores numéricos")
        progressao();
    }
}
progressao();
