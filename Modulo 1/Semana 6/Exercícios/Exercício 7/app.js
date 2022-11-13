async function buscaPreco(){
    let result = await fetch(`https://api.coincap.io/v2/assets/bitcoin`)
    result = await result.json()
    alert(`O preço do Bitcoin${result.data.symbol} em dólares hoje é $${result.data.priceUsd}`)
}
buscaPreco()