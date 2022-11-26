import { Component } from '@angular/core';
import { NOTIFICACOES } from './mocks/mocks';

@Component({
  selector: 'ntap-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Projeto';
  notificacoes = NOTIFICACOES
}