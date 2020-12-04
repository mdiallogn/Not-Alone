import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { JetonsComponent } from './jetons/jetons.component';
import { PionsComponent } from './pions/pions.component';
import { PisteComponent } from './piste/piste.component';
import { CardComponent } from './cards/card/card.component';
import { CardsListComponent } from './cards/cards-list/cards-list.component';
import { CardDetailComponent } from './cards/card-detail/card-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    JetonsComponent,
    PionsComponent,
    PisteComponent,
    CardComponent,
    CardsListComponent,
    CardDetailComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
