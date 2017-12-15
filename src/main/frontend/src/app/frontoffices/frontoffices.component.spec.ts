import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FrontofficesComponent } from './frontoffices.component';

describe('FrontofficesComponent', () => {
  let component: FrontofficesComponent;
  let fixture: ComponentFixture<FrontofficesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FrontofficesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FrontofficesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
