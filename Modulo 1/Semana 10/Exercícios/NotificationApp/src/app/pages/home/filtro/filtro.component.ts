import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'noteApp-filtro',
  templateUrl: './filtro.component.html',
  styleUrls: ['./filtro.component.scss']
})
export class FiltroComponent {
  filtros: string[] = [
    "Todos", "Lidos", "Não Lidos"
  ]
  @Output() lista: EventEmitter<string> = new EventEmitter()
  filtragem(evento: any) {
    this.lista.emit(evento)
  }
}
