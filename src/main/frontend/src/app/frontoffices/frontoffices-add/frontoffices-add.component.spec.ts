import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FrontofficesAddComponent } from './frontoffices-add.component';

describe('FrontofficesAddComponent', () => {
  let component: FrontofficesAddComponent;
  let fixture: ComponentFixture<FrontofficesAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FrontofficesAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FrontofficesAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
