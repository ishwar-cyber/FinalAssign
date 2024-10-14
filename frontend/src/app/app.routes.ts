import { Routes } from '@angular/router';
import { HotelsComponent } from './common/hotels/hotels.component';
import { PageNotFoundComponent } from './common/page-not-found/page-not-found.component';

export const routes: Routes = [
    {
        path:'',component:HotelsComponent
    },
    {
        path:'hotel',component:HotelsComponent
    },
    {
        path:'**', component: PageNotFoundComponent
    }

];
