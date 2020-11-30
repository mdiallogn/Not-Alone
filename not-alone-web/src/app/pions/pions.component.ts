import { Component, OnInit } from '@angular/core';
import {JetonAndPionObject} from '../jetonAndPionObject';


@Component({
  selector: 'app-pions',
  templateUrl: './pions.component.html',
  styleUrls: ['./pions.component.css']
})
export class PionsComponent implements OnInit {

  listOfPions: JetonAndPionObject[] = [
    {id: 1, name: 'Balise'},
    {id: 2, name: 'Secours'},
    {id: 3, name: 'Assimilation'},
    {id: 2, name: 'Volonté'}
  ];



  foo(component: JetonAndPionObject) {
    alert(component.name);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
