import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DateUtilComponent } from './date-util/date-util.component';
import { YoutubePlaylistComponent } from './youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './youtube-player/youtube-player.component';
import { DictionaryPageComponent } from './dictionary-page/dictionary-page.component';
import { CreateDictionaryComponent } from './create-dictionary/create-dictionary.component';
import {ReactiveFormsModule} from '@angular/forms';
import { DetailDictionaryComponent } from './detail-dictionary/detail-dictionary.component';

@NgModule({
  declarations: [
    AppComponent,
    DateUtilComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    DictionaryPageComponent,
    CreateDictionaryComponent,
    DetailDictionaryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
