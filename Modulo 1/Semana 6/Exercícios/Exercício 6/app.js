async function buscarIdade(nome){
    let result = await fetch(`https://api.agify.io/?country_id=BR&name=${nome}`)
    result = await result.json()
    alert(`Nome: ${nome}, Idade Média: ${result.age}`)
}

buscarIdade(prompt())