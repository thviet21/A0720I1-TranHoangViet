import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent implements OnInit {
  today = new Date();
  user = {
    name: 'bob mike'
  };

  price = 15000;
  symbol = 'VND';

  constructor() { }

  ngOnInit(): void {
  }

}
