import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponentComponent } from './cart-component/cart-component.component';

const routes: Routes = [
  {
    path:'cartitem',component:CartComponentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
