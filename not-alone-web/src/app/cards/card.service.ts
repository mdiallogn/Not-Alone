import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CardService {

  private baseUrl = "";


  constructor(private http: HttpClient) {}

  getCard(id: number): Observable<any>{
    return null;
  }
}
