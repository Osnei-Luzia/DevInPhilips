import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'noteApp-filtro',
  templateUrl: './filtro.component.html',
  styleUrls: ['./filtro.component.scss']
})
export class FiltroComponent {
  filtros = [
    {
      nome: "Todos",
      endereco: "todos"
    },
    {
      nome: "Lidos",
      endereco: "lidos"
    },{
      nome: "Não Lidos",
      endereco: "naolidos"
    },
  ]
  @Output() lista: EventEmitter<string> = new EventEmitter()
  filtragem(evento: any) {
    this.lista.emit(evento)
  }
}
