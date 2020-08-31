import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateQualityComponent } from './update-quality.component';

describe('UpdateQualityComponent', () => {
  let component: UpdateQualityComponent;
  let fixture: ComponentFixture<UpdateQualityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateQualityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateQualityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
