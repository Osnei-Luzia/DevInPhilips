import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { FiltroComponent } from './pages/home/filtro/filtro.component';
import { AboutComponent } from './pages/about/about.component';
import { HomeComponent } from './pages/home/home/home.component';
import { ContentComponent } from './pages/home/content/content.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    FiltroComponent,
    AboutComponent,
    HomeComponent,
    ContentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
