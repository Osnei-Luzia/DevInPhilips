import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './pages/about/about.component';
import { HomeComponent } from './pages/home/home/home.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'home/todos',component:HomeComponent,data:{status: 'todos'}},
  {path:'home/lidos',component:HomeComponent,data:{status: 'lidos'}},
  {path:'home/naolidos',component:HomeComponent,data:{status: 'nao-lidos'}},
  {path:'about',component:AboutComponent},
  {path:'',component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
