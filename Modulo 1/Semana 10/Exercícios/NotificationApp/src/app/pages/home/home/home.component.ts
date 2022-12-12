import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'noteApp-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  atualizarLista(evento: any) {
    this.route.navigateByUrl(`/home/${evento.target.id}`)
  }
  constructor(private route : Router){
    
  }
}
