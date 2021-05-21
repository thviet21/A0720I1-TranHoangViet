import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CountdownTimerEventsAliasComponent } from './countdown-timer-events-alias.component';

describe('CountdownTimerEventsAliasComponent', () => {
  let component: CountdownTimerEventsAliasComponent;
  let fixture: ComponentFixture<CountdownTimerEventsAliasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CountdownTimerEventsAliasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CountdownTimerEventsAliasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
