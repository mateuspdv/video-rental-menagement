import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ActorCrudComponent } from './pages/actor-crud/actor-crud.component';

const routes: Routes = [
  {
    path: '',
    component: ActorCrudComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActorRoutingModule {}
