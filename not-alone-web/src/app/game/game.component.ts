import { Component, OnInit } from '@angular/core';
import {Phases} from "./phases";

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {

private phase: Phases;

  constructor() { }

  ngOnInit() {
  }

}
