import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetclientsComponent } from './getclients.component';

describe('GetclientsComponent', () => {
  let component: GetclientsComponent;
  let fixture: ComponentFixture<GetclientsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetclientsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetclientsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
