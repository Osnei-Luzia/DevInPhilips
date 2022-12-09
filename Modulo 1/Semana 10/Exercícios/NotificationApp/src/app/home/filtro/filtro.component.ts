import { Component } from '@angular/core';

@Component({
  selector: 'noteApp-filtro',
  templateUrl: './filtro.component.html',
  styleUrls: ['./filtro.component.scss']
})
export class FiltroComponent {
  filtros : string[] = [
    "Todos","Lidos","Não Lidos"
  ]
}
