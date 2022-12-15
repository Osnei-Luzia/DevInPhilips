import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent {
  pages = [
    "home",
    "preços",
    "informações"
  ]
  endereco = ""
  //   {
  //     nome: "Home",
  //     endereco: "home"
  //   },
  //   {
  //     nome: "Preços",
  //     endereco: "precos"
  //   },{
  //     nome: "Informações",
  //     endereco: "informacoes"
  //   },
  // ]
}
