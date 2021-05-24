import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {DictionaryPageService} from '../dictionary-page.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-create-dictionary',
  templateUrl: './create-dictionary.component.html',
  styleUrls: ['./create-dictionary.component.css']
})
export class CreateDictionaryComponent implements OnInit {
  dictionaryForm: FormGroup;
  constructor(private dictionaryPageService: DictionaryPageService, private router: Router) { }

  ngOnInit(): void {
    this.initForm();
  }
  initForm(){
    this.dictionaryForm = new FormGroup({
      english: new FormControl('', Validators.compose([Validators.required, Validators.maxLength(100)])),
      vietnamese: new FormControl('', Validators.compose([Validators.required])),
      description: new FormControl('', Validators.compose([Validators.required]))
    });
  }

  createDictionary(){
    if (this.dictionaryForm.valid){
      this.dictionaryPageService.createDictionaryEntry(this.dictionaryForm.value);
      this.router.navigateByUrl('/');
    }
  }
}
