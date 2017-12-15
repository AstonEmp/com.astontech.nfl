import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConferencesAddComponent } from './conferences-add.component';

describe('ConferencesAddComponent', () => {
  let component: ConferencesAddComponent;
  let fixture: ComponentFixture<ConferencesAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConferencesAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConferencesAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
