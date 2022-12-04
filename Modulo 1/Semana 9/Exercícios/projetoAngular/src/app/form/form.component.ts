import { Component,Inject } from '@angular/core';
import {ControladorEnviosService} from '../controlador-envios.service'

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent {
  constructor(private servicos : ControladorEnviosService){
  }
  data = {
    materia: "",
    cargaHoraria: ""
  }
  enviar(evento: any) {
    evento.preventDefault()
    this.servicos.setData(this.data)
    console.log(this.servicos.getData())
  }
}

