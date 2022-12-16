import { Component } from '@angular/core';


@Component({
  selector: 'app-generic-input',
  templateUrl: './generic-input.component.html',
  styleUrls: ['./generic-input.component.scss']
})
export class GenericInputComponent {
  password: string = "123"
  inputPassword: string = ""
}
