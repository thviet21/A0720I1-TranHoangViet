import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontSizeComponent } from './font-size/font-size.component';
import {FormsModule} from '@angular/forms';
import { PetInformationComponent } from './pet-information/pet-information.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { PickColorComponent } from './pick-color/pick-color.component';
import { HackernewsComponent } from './hackernews/hackernews.component';
import { LikesComponent } from './likes/likes.component';
import { NameCardComponent } from './name-card/name-card.component';

@NgModule({
  declarations: [
    AppComponent,
    FontSizeComponent,
    PetInformationComponent,
    CalculatorComponent,
    PickColorComponent,
    HackernewsComponent,
    LikesComponent,
    NameCardComponent
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
