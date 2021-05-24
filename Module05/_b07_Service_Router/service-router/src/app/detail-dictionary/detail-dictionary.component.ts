import {Component, OnInit} from '@angular/core';
import {DictionaryPageService} from '../dictionary-page.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {Dictionary} from '../Dictionary';

@Component({
  selector: 'app-detail-dictionary',
  templateUrl: './detail-dictionary.component.html',
  styleUrls: ['./detail-dictionary.component.css']
})
export class DetailDictionaryComponent implements OnInit {
  formView: FormGroup;
  private id: number;
  constructor(private dictionaryPageService: DictionaryPageService, private router: Router, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.params['id'];
    this.initForm();
    this.formView.patchValue(this.dictionaryPageService.getDictionaryEntry(this.id));
  }

  initForm() {
    this.formView = new FormGroup({
      id: new FormControl(),
      english: new FormControl('', Validators.compose([Validators.required, Validators.maxLength(100)])),
      vietnamese: new FormControl('', Validators.compose([Validators.required, Validators.minLength(10)])),
      description: new FormControl('', Validators.compose([Validators.required, Validators.minLength(10)]))
    });
  }
}
