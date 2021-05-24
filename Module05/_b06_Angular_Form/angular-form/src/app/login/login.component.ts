import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  formLogin: FormGroup;
  constructor(private fb: FormBuilder) { }
  validation_messages = {
    'email': [
      {type: 'required', message: 'Email không được để trống'},
      {type: 'pattern', message: 'Email không đúng định dạng'}
    ],
    'password': [
      {type: 'required', message: 'Email không được để trống'}
    ],
  }
  ngOnInit(): void {
    this.initFormLogin();
  }

  initFormLogin(){
    this.formLogin = this.fb.group({
      email: ['', Validators.compose([
        Validators.required,
        Validators.pattern(/^[\w-.]+@([\w-]+\.)+[\w-]{2,4}$/g)
      ])],
      password: ['', Validators.compose([
        Validators.required
      ])]
    });
  }
  onSubmit(){
    if (this.formLogin.valid){
      const password = this.formLogin.controls.password.value;
      if ('123456' === password){
        alert('Đăng nhập thành công!');
      }else { alert('Sai mật khẩu'); }
    }
  }
}
