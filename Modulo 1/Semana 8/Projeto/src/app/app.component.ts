import { Component } from '@angular/core';

@Component({
  selector: 'ntap-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Projeto';
  conteudo = [
    {
      titulo: "Titulo1",
      subtitulo: "Subtitulo1",
      data: new Date()
    },
    {
      titulo: "Titulo2",
      subtitulo: "Subtitulo2",
      data: new Date()
    },
    {
      titulo: "Titulo3",
      subtitulo: "Subtitulo3",
      data: new Date()
    }
  ]
}

