import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FormComponent } from './form/form.component';
import { ModalComponent } from './modal/modal.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ItemCardComponent } from './item-card/item-card.component';
import { FormsModule } from '@angular/forms';
import { BuscaComponent } from './busca/busca.component';

@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    ModalComponent,
    NavbarComponent,
    ItemCardComponent,
    BuscaComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
