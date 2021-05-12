import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-pet-information',
  templateUrl: './pet-information.component.html',
  styleUrls: ['./pet-information.component.css']
})
export class PetInformationComponent implements OnInit {

  constructor() {
  }

  pet = {
    namePet: 'Husky',
    imagePet: './assets/pet1.jpg',
    pricePet: 300
  };

  ngOnInit(): void {
  }

  updateName(name){
    this.pet.namePet = name;
  }
  updateImage(image){
    this.pet.imagePet = image;
  }
}
