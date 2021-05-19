import {Component, Input, OnInit} from '@angular/core';
@Component({
  selector: 'app-name-card',
  templateUrl: './name-card.component.html',
  styleUrls: ['./name-card.component.css']
})
export class NameCardComponent implements OnInit {
  constructor() { }
  @Input() cardName: string;
  @Input() email: string;
  @Input() phone: string;
  listDevInformation = [
    {
      name: 'Kenn',
      email: 'tranhoangviet.21@gmail.com',
      phone: '0704529871'
    },
    {
      name: 'Kenn',
      email: 'tranhoangviet.21@gmail.com',
      phone: '0704529871'
    },
    {
      name: 'Kenn',
      email: 'tranhoangviet.21@gmail.com',
      phone: '0704529871'
    },
    {
      name: 'Kenn',
      email: 'tranhoangviet.21@gmail.com',
      phone: '0704529871'
    }
  ];

  ngOnInit(): void {
  }
}
