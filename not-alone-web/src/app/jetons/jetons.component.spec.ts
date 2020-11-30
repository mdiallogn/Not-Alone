import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JetonsComponent } from './jetons.component';

describe('JetonsComponent', () => {
  let component: JetonsComponent;
  let fixture: ComponentFixture<JetonsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JetonsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JetonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
