import Time from "./Time.js"
import Partida from "./Partida.js"

const timeA = new Time("Palmeiras","Pal",0,0,0,0,0)
const timeB = new Time("Flamengo","Fla",0,0,0,0,0)

const partida = new Partida("Pal",2,"Fla",1)

timeA.computarPartida(partida)
timeB.computarPartida(partida)

timeA.exibirSituacao()
timeB.exibirSituacao()