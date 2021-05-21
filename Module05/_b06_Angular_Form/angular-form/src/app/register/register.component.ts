import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ICustomer} from '../Customer';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  formCreateCustomerReactive: FormGroup;
  customer: ICustomer;
  constructor() {
    this.formCreateCustomerReactive = new FormGroup({
      id: new FormControl(),
      email: new FormControl(),
      password: new FormControl(),
      confirmpw: new FormControl(),
      country: new FormControl(),
      age: new FormControl(),
      gender: new FormControl(),
      phone: new FormControl()
    });
  }

  ngOnInit(): void {
  }

  onSubmit() {
    if (this.formCreateCustomerReactive.valid){
      this.customer = this.formCreateCustomerReactive.value;
      console.log(this.customer);
    }
  }
}
