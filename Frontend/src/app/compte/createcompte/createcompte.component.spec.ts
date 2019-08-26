import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatecompteComponent } from './createcompte.component';

describe('CreatecompteComponent', () => {
  let component: CreatecompteComponent;
  let fixture: ComponentFixture<CreatecompteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreatecompteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatecompteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
