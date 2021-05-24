import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {ICustomer} from '../Customer';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private fb: FormBuilder) {
  }

  formCreateCustomerReactive: FormGroup;
  customer: ICustomer;

  // tslint:disable-next-line:variable-name
  validation_messages = {
    'id': [
      {type: 'required', message: 'ID không được để trống'}
    ],
    'email': [
      {type: 'required', message: 'Email không được để trống'},
      {type: 'pattern', message: 'Email không đúng định dạng'}
    ],
    'phone': [
      {type: 'required', message: 'Phone không được để trống'},
      {type: 'pattern', message: 'Phone không đúng định dạng'}
    ]
  };

  ngOnInit(): void {
    this.initForm();
  }

  initForm() {
    this.formCreateCustomerReactive = this.fb.group({
      id: ['', Validators.required],
      email: ['', Validators.compose([
        Validators.required,
        Validators.pattern(/^[\w-.]+@([\w-]+\.)+[\w-]{2,4}$/g)
      ])],
      password: [],
      confirmpw: [],
      country: [],
      age: [],
      gender: [],
      phone: ['',
        Validators.pattern(/^(09|01[\d])+([0-9]{8})\b/g)
      ]
    });
  }

  onSubmit() {
    if (this.formCreateCustomerReactive.valid) {
      this.customer = this.formCreateCustomerReactive.value;
      console.log(this.customer);
    }
  }
  validatePassword(){

  }
}
