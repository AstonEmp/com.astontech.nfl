import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FrontofficesListComponent } from './frontoffices-list.component';

describe('FrontofficesListComponent', () => {
  let component: FrontofficesListComponent;
  let fixture: ComponentFixture<FrontofficesListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FrontofficesListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FrontofficesListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
