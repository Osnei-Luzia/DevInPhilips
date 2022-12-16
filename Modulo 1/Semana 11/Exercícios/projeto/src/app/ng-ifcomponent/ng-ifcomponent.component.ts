import { Component } from '@angular/core';

@Component({
  selector: 'app-ng-ifcomponent',
  templateUrl: './ng-ifcomponent.component.html',
  styleUrls: ['./ng-ifcomponent.component.scss']
})
export class NgIfcomponentComponent {
  showModal: boolean = false;
  eventoModal(){
    this.showModal = !this.showModal
  }
}
