import {Component, OnInit} from '@angular/core';
import {throwError} from 'rxjs';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  constructor() {
  }

  value: string;

  number_a: number = 0;

  number_b: number = 0;

  result: number;

  ngOnInit(): void {
  }

  // tslint:disable-next-line:variable-name
  onClick(value) {
    switch (value) {
      case '+':
        return this.result = number_a + number_b;
      case '-':
        return this.result = number_a - number_b;
      case '*':
        return this.result = number_a * number_b;
      case '/':
        if (number_b === 0) {
          throw Error('Chia cho 0!');
        } else {
          return this.result = number_a / number_b;
        }
    }
  }
}
