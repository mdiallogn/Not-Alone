import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Card} from "../card";

@Component({
  selector: 'app-card-detail',
  templateUrl: './card-detail.component.html',
  styleUrls: ['./card-detail.component.css']
})
export class CardDetailComponent implements OnInit {
  cards: Observable<Card[]>;

  constructor(private cardService: CardService, ) { }

  ngOnInit(): void {
  }

}
