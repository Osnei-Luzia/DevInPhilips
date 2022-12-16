import { Component } from '@angular/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.scss']
})
export class CardsComponent {
  arrayFotos: any = [
    {
      url: "https://images.unsplash.com/photo-1507525428034-b723cf961d3e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YmFja2dyb3VuZHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60",
      description: "Praia"
    },
    {
      url: "https://images.unsplash.com/photo-1571292098320-997aa03a5d19?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8YmFja2dyb3VuZHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60",
      description: "Parede Azul"
    },
    {
      url: "https://images.unsplash.com/photo-1519817914152-22d216bb9170?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8YmFja2dyb3VuZHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60",
      description: "Estrada"
    },
    {
      url: "https://images.unsplash.com/photo-1603561943596-be37143927ec?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGJhY2tncm91bmRzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60",
      description: "Estrada no outono"
    },
    {
      url: "https://images.unsplash.com/photo-1477346611705-65d1883cee1e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fHdhbGxwYXBlcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60",
      description: "Montanhas"
    }
  ]
}
