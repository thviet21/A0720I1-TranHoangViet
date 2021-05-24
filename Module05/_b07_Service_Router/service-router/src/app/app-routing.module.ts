import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {DateUtilComponent} from './date-util/date-util.component';
import {YoutubePlaylistComponent} from './youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './youtube-player/youtube-player.component';
import {DictionaryPageComponent} from './dictionary-page/dictionary-page.component';
import {CreateDictionaryComponent} from './create-dictionary/create-dictionary.component';
import {DetailDictionaryComponent} from './detail-dictionary/detail-dictionary.component';


const routes: Routes = [
  {
    path: 'time-line', component: DateUtilComponent
  },
  {
    path: 'youtube',
    component: YoutubePlaylistComponent,
    children: [{
      path: ':id',
      component: YoutubePlayerComponent
    }]
  },
  {path: 'dictionary', component: DictionaryPageComponent},
  {path: 'dictionary/create', component: CreateDictionaryComponent},
  {path: 'dictionary/view/:id', component: DetailDictionaryComponent},
  {path: 'dictionary/edit/:id', component: CreateDictionaryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
