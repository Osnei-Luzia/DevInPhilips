import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CaptalizePhillipsPipe } from './pipes/captalize-phillips.pipe';
import { GenericComponent } from './generic/generic.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CardsComponent } from './cards/cards.component';
import { NgIfcomponentComponent } from './ng-ifcomponent/ng-ifcomponent.component';
import { GenericInputComponent } from './generic-input/generic-input.component';
import { ListaComponent } from './lista/lista.component';

@NgModule({
  declarations: [
    AppComponent,
    CaptalizePhillipsPipe,
    GenericComponent,
    NavbarComponent,
    CardsComponent,
    NgIfcomponentComponent,
    GenericInputComponent,
    ListaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
