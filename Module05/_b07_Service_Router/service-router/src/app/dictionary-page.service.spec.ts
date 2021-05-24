import { TestBed } from '@angular/core/testing';

import { DictionaryPageService } from './dictionary-page.service';

describe('DictionaryPageService', () => {
  let service: DictionaryPageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DictionaryPageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
