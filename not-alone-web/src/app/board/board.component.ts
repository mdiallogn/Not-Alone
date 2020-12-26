import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Box} from "./box";

@Component({
  selector: 'app-board',
  templateUrl: './board.component.html',
  styleUrls: ['./board.component.css']
})
export class BoardComponent implements OnInit {

  @ViewChild('canvas')
  canvas: ElementRef<HTMLCanvasElement>;
  private ctx: CanvasRenderingContext2D;



  constructor() {

  }

  fill(){

    this.ctx.fillStyle = 'red';
    const box = new Box(this.ctx);
    box.draw(1, 1, 50);
  }

  ngOnInit() {
    this.ctx = this.canvas.nativeElement.getContext('2d');
    this.fill();
  }

}
