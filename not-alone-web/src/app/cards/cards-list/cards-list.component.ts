import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Card} from "../card";
import {CardService} from "../card.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-cards-list',
  templateUrl: './cards-list.component.html',
  styleUrls: ['./cards-list.component.css']
})
export class CardsListComponent implements OnInit {

  cards: Observable<Card[]>;
  constructor(private cardService: CardService, private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData(){
    this.cards = null;
  }

  cardDetails(id: Object){
    this.router.navigate(['details', id]);
  }

}
