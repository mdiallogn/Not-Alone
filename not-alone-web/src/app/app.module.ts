import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { JetonsComponent } from './jetons/jetons.component';
import { PionsComponent } from './pions/pions.component';
import { PisteComponent } from './piste/piste.component';

@NgModule({
  declarations: [
    AppComponent,
    JetonsComponent,
    PionsComponent,
    PisteComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
