import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-piste',
  templateUrl: './piste.component.html',
  styleUrls: ['./piste.component.css']
})
export class PisteComponent implements OnInit {

  public static dirtyDraw(): void {
    // Create and attach Canvas to the DOM
    const canvas = document.createElement('canvas');
    canvas.setAttribute('width', '500px');
    canvas.setAttribute('height', '500px');
    document.getElementById('piste').appendChild(canvas);

    // draw red square
    // tslint:disable-next-line:no-non-null-assertion
    const ctx = canvas.getContext('2d')!;
    ctx.beginPath();
    const  size =  100;
    const offset = 10;
    ctx.fillStyle = 'rgb(255,0,0)';
    for (let i = 0; i < 8; i++) {
      for (let j = 0; j < 4; j++) {
        ctx.rect((size + offset) * i, (size + offset) * j, size, size);
        ctx.fill();
      }
    }
  }

  public executeDraw(): void {
    PisteComponent.dirtyDraw();
  }
  constructor() { }

  ngOnInit(): void {
  }

}
