import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PionsComponent } from './pions.component';

describe('PionsComponent', () => {
  let component: PionsComponent;
  let fixture: ComponentFixture<PionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
