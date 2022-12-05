import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-busca',
  templateUrl: './busca.component.html',
  styleUrls: ['./busca.component.scss']
})
export class BuscaComponent {
  value : String = ""
  @Output() buscar:EventEmitter<any> = new EventEmitter();
  executeBuscar(){
    this.buscar.emit(this.value)
  }
}
