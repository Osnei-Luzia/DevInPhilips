import { Component } from '@angular/core';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.scss']
})
export class ListaComponent {
  inputTarefa: any = null
  listagem: string[] = []
  salvar() {
    if(this.inputTarefa){
      this.listagem.push(this.inputTarefa)
    }
  }
  remover(event: any) {
    this.listagem.splice(event.target.id,1)
  }
}
