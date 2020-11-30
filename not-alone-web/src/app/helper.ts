export class Helper extends RTCIdentityAssertion {

  public static dirtyDraw(): void {
    // Create and attach Canvas to the DOM
    const canvas = document.createElement('canvas');
    canvas.setAttribute('width', '500px');
    canvas.setAttribute('height', '500px');
    document.body.appendChild(canvas);

    // draw red square
    // tslint:disable-next-line:no-non-null-assertion
    const ctx = canvas.getContext('2d')!;
    ctx.beginPath();
    ctx.fillStyle = 'rgb(255,0,0)';
    ctx.rect(10, 10, 50, 50);
    ctx.fill();
  }
}
