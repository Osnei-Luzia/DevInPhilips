let mes = new Date().getMonth()+1;
let dia = new Date().getDate();

if(dia <= 21){
    if(mes <= 3){
        alert("Verão")
    }else if(mes <= 6){
        alert("Outono")
    }else if(mes <= 9){
        alert("Inverno")
    }else if(mes <= 12){
        alert("Primavera")
    }
}else{
    if(mes >= 12){
        alert("Verão")
    }else if(mes >= 9){
        alert("Primavera")
    }else if(mes >= 6){
        alert("Inverno")
    }else if(mes >= 3){
        alert("Outono")
    }else{
        alert("Verão")
    }
}