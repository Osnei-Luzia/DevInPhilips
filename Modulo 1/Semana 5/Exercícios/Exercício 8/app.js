import Usuario from "./Usuario.js"

const usuario = new Usuario("Nome","teste@gmail.com","0451")
function autenticar(evento){
    evento.preventDefault()
    usuario.autenticar(document.getElementById("email").value,document.getElementById("senha").value)?
    alert("true"):alert("false");
}
document.getElementById("login").addEventListener("submit",autenticar)
