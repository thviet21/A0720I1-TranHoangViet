import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NameCardComponent } from './name-card/name-card.component';
import { ProcessBarComponent } from './process-bar/process-bar.component';
import {RatingBarComponent} from './rating-bar/rating-bar.component';
import { CountdownTimerEventsAliasComponent } from './countdown-timer-events-alias/countdown-timer-events-alias.component';
import { PipeComponent } from './pipe/pipe.component';

@NgModule({
  declarations: [
    AppComponent,
    NameCardComponent,
    ProcessBarComponent,
    RatingBarComponent,
    CountdownTimerEventsAliasComponent,
    PipeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
