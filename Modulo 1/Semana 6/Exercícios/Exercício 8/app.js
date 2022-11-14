async function criarUsuario(numUsuario) {
    let result = await fetch(`https://randomuser.me/api/?results=${numUsuario}`)
    const {results} = await result.json()
    return results
}
async function distruibuirUsuario(event){
    event.preventDefault()
    document.getElementById("lista").innerHTML = ""
    const usuarios = await criarUsuario(document.getElementById("input").value)
    console.log(usuarios[0])
    usuarios.forEach(usuario => {
        const novaDiv = document.createElement("div")
        novaDiv.innerHTML = `<img src="${usuario.picture.large}"><div><p>${usuario.name.title} ${usuario.name.first} ${usuario.name.last}</p><p>${usuario.email}</p><p>${usuario.location.street.number} ${usuario.location.street.name}</p></div>`
        document.getElementById("lista").appendChild(novaDiv)
    })
}
document.getElementById("divForm").addEventListener("submit",distruibuirUsuario)