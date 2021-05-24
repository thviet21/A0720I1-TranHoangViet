import { Component, OnInit } from '@angular/core';
import {DictionaryPageService} from '../dictionary-page.service';
import {Dictionary} from '../Dictionary';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  listDictionary: Dictionary[];
  constructor(private dictionaryPageService: DictionaryPageService) { }

  ngOnInit(): void {
    this.initDataListProduct();
  }
  initDataListProduct() {
    this.listDictionary = this.dictionaryPageService.getAll();
    console.log(this.listDictionary);
  }
}
