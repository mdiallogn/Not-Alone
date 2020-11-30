import { Component, OnInit } from '@angular/core';
import {JetonAndPionObject} from '../jetonAndPionObject';
import {View} from '../view';

@Component({
  selector: 'app-jetons',
  templateUrl: './jetons.component.html',
  styleUrls: ['./jetons.component.css']
})
export class JetonsComponent implements OnInit {

  listOfJetons: JetonAndPionObject[] = [
    {id: 1, name: 'Cible'},
    {id: 2, name: 'Créature'},
    {id: 3, name: 'Artemia'}
  ];

  foo(component: JetonAndPionObject) {
    alert(component.name);
  }

  draw(): void {
    View.dirtyDraw();
  }

  constructor() { }

  ngOnInit(): void {
  }

}
